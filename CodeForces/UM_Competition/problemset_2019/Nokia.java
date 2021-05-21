package practice;

import java.util.Scanner;

public class Nokia {
    public void test(){
        System.out.println("uwu");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String[] out = new String[n];
        for (int i = 0; i < n; i++)
            out[i] = transform(sc.nextLine());

        for (String e : out)
            System.out.println(e);
    }

    private static String transform(String str) {
        str = str.toLowerCase();
        String[][] val = {
                {"2", "22", "222"}, {"3", "33", "333"},
                {"4", "44", "444"}, {"5", "55", "555"}, {"6", "66", "666"},
                {"7", "77", "777", "7777"}, {"8", "88", "888"}, {"9", "99", "999"}};

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                out.append("0");
            } else if (c >= 'p' && c <= 'z') {
                if (c <= 's')
                    out.append(val[5][c - 'p']);
                else if (c <= 'v')
                    out.append(val[6][c - 't']);
                else
                    out.append(val[7][c - 'w']);
            } else {
                double diff = c - 'a' + 1;
                out.append(val[(int) Math.ceil(diff / 3) - 1][(int) diff - nearestMul3((int) diff) - 1]);
            }
        }
        return out.toString();
    }

    private static int nearestMul3(int num) {
        int i;
        for (i = 0; i < num - 3; i += 3) {
        }
        return i;
    }
}

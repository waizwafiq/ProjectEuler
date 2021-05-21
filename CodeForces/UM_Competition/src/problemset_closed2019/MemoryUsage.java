package problemset_closed2019;

import java.util.Scanner;

public class MemoryUsage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        String[][] proc = new String[n][3];
        for (int i = 0; i < n; i++) {
            sc.next();
            proc[i] = sc.nextLine().split(" ");
        }
        for (int i = 0; i < q; i++) {
            int p = sc.nextInt();
            int sum = 0;
            for (int j = p - 1; j < proc.length; j++)
                sum += Integer.parseInt(proc[j][2]);
            System.out.println(sum);
        }

    }
}

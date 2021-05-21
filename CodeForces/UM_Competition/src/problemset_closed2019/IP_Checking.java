package problemset_closed2019;

import java.util.Scanner;

public class IP_Checking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < T; i++) {
            boolean matched = true;
            String[] IP_dec = sc.nextLine().split("\\.");
            String[] IP_bin = sc.nextLine().split("\\.");

            for (int j = 0; j < IP_dec.length; j++)
                if (Integer.parseInt(IP_dec[j]) != (Integer.parseInt(IP_bin[j], 2))) {
                    matched = false;
                    break;
                }

            System.out.print("Case " + (i + 1) + ": ");
            if (matched)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}

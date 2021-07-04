package final_round2021;

import java.util.Arrays;
import java.util.Scanner;

public class G {
    public static boolean isPrime(int num) {
        /*A function to determine if a number num is prime or not
         * Algorithm: Simple 6k+-1 optimization
         * return:
         * > true : prime
         * > false: not prime*/
        if (num <= 3) return num > 1;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(num); i += 6)
            if (num % i == 0 || num % (i + 2) == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[2][N];
        arr[0] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        arr[1] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = arr[0][i]; j <= arr[1][i]; j++) {
                if (!isPrime(j))
                    sum += j;
            }
        }

        System.out.println(sum);
    }
}

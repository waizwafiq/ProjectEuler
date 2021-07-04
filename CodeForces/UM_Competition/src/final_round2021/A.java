package final_round2021;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        sc.nextLine();
        int current = 1, step = 1;
        int[][] foods = new int[n][2];
        for(int i=0; i<n; i++)
            foods[i] = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        java.util.Arrays.sort(foods, Comparator.comparingInt(a -> a[0]));

        for (int i = 0; i < n; i++) {
            while(foods[i][0] - current > x) {
                current += x; //jump
            }
            while(current != foods[i][0]) {
                //go beside it
                current++;
                step++;
            }
            if (current == foods[i][0]) {
                step += (foods[i][1] - foods[i][0]); //collect all food
                current = foods[i][1]; //at the end of trail
            }
        }

        System.out.println(step);
    }
}

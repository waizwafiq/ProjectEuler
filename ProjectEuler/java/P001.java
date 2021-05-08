/*PROBLEM 001
* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
* The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000. */

public class P001 {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=0; i<1000; i++) //for all numbers from 0 to 999:
            if(i%3==0 || i%5==0) sum += i; //if the number is the multiple of 3 or 5, sum it.

        System.out.println("Sum = "+sum); //prints the sum
    }
}

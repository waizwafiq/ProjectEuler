/*PROBLEM 007
* By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
* What is the 10 001st prime number?
*/

public class P007 {
    public static void main(String[] args) {
        int n = 10001, count;
        long i=0L;

        if(n==1) System.out.println("Prime number: 2");
        else {
            for (i = 1, count = 0; count != n; i++)
                if (P003.isPrime(i))
                    count++; //increase counter until it reaches n to get the nth prime number
            System.out.println("nth prime number: "+(i-1));
        }
    }
}


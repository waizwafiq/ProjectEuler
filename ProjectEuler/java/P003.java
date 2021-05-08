/*PROBLEM 003
* The prime factors of 13195 are 5, 7, 13 and 29.
* What is the largest prime factor of the number 600851475143?
* */

public class P003 {
    public static void main(String[] args) {
        long max = 0L, num = 600851475143L;
        for(long i=1; i <= Math.sqrt(num); i++) {
            /*For every number i from 1 to num/2:
             *   if i is prime and num%i==0:
             *       i is a prime factor of num
             *       so, assign i into max to get the highest prime factor*/
            if (isPrime(i) && num % i == 0) max=i;
        }
        System.out.println("The largest prime factor of the number "+num+" is "+max);

    }

    public static boolean isPrime(int num){
        /*A function to determine if a number num is prime or not
         * Algorithm: Simple 6k+-1 optimization
         * return:
         * > true : prime
         * > false: not prime*/
        if(num <= 3) return num>1;
        if(num%2==0 || num%3==0) return false;

        for(int i=5; i <= Math.sqrt(num); i+=6)
            if(num%i==0 || num%(i+2)==0) return false;
        return true;
    }

    public static boolean isPrime(long num){
        /*A function to determine if a very long number num is prime or not
         * Algorithm: Simple 6k+-1 optimization
         * return:
         * > true : prime
         * > false: not prime*/
        if(num <= 3) return num>1;
        if(num%2==0 || num%3==0) return false;

        for(int i=5; i <= Math.sqrt(num); i+=6)
            if(num%i==0 || num%(i+2)==0) return false;
        return true;
    }
}

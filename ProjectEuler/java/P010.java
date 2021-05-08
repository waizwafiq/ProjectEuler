/*PROBLEM 010
* The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
* Find the sum of all the primes below two million.
*/

public class P010 {
    public static void main(String[] args) {
        long sum = 0, max=2000000;
        for(int p=1; p<max; p++)
            if(MyLib.isPrime(p)) sum+=p;
        System.out.println("The sum of all primes below "+max+" is "+sum);
    }
}

public class MyLib {
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

    public static boolean isPalindrome(int num){
        int ori = num, reverse = 0;
        while(num>0){
            reverse = reverse*10 + num%10;
            num/=10;
        }
        return ori == reverse;
    }

    public static int toInt(char letter){
        return letter-'0';
    }
}

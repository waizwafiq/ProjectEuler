/*PROBLEM 004
* A palindromic number reads the same both ways.
* The largest palindrome made from the product of two 2-digit numbers is
* 9009 = 91 × 99.
* Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class P004 {
    public static void main(String[] args) {
        int max1, max2;
        loop:
        for(int i=1000; i>100; i--)
            for(int j=1000; j>100; j--)
                if(isPalindrome(i*j)){
                    System.out.println(i*j+" = "+i+" x "+j);
                    break loop;
                }
    }

    public static boolean isPalindrome(int num){
        int ori = num, reverse = 0;
        while(num>0){
            reverse = reverse*10 + num%10;
            num/=10;
        }
        return ori == reverse;
    }
}

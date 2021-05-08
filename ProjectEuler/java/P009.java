/*PROBLEM 009
* A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
*                       a^2 + b^2 = c^2
* For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
* There exists exactly one Pythagorean triplet for which a + b + c = 1000.
* Find the product abc.
*/

public class P009 {
    public static void main(String[] args) {
        int a,b,c1;
        double c2;

        for(a = 1; a<1000; a++) {
            for (b = 1; b < 1000; b++){
                c2 = Math.sqrt(a*a + b*b);
                c1 = (int)c2;
                if(c1 == c2 && a+b+c2 == 1000 && a<b){
                    /* c1 == c2 : to determine if c is a whole number
                     * a+b+c2 == 1000 : to determine if a+b+c gives 1000
                     * a < b : to satisfy the restriction of a < b < c */
                    System.out.println(a+"^2 + "+b+"^2 = "+c1+"^2");
                    System.out.println("abc = "+(a*b*c1));
                    break;
                }
            }

        }
    }
}

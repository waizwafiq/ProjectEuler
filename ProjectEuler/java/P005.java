/*PROBLEM 005
* 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
* What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
* */

public class P005 {
    public static void main(String[] args) {
        int max = 20, i = 2520;
        boolean repeat = true;
        while(repeat){
            i+=max; //i is divisible by max, so it's faster to increment by that number
            for(int j=1; j<=max; j++){
                if(i%j != 0){
                    repeat = true;
                    break;
                }
                repeat = false;
            }
        }


        System.out.println("Smallest positive number that is evenly divisible by all of the numbers from 1 to "+max+" = "+i);
    }
}

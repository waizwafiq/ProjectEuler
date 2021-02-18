/*PROBLEM 006
* Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/

public class P006 {
    public static void main(String[] args) {
        int n=100, SumSq=0, SqSum=0;
        for(int i=1; i<=n; i++){
            SumSq += i*i; SqSum += i;
        }
        SqSum *= SqSum;
        System.out.print("The difference between the sum of the squares of the first "+n+" natural numbers and the square of the sum is ");
        System.out.println(SqSum+" - "+SumSq+" = "+(SqSum-SumSq));
    }
}

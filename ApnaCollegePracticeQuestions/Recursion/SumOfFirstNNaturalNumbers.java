package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static int calculateSum(int n) {
        if(n == 1) {
            return 1;
        }
        return n + calculateSum(n-1);
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + calculateSum(n));
        scan.close();
    }
}

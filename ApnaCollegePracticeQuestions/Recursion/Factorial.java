package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if(n==0 || n==1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Factorial is: " + factorial(n));
        scan.close();
    }
}

package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public interface NthFibonacciNumber {
    public static int nthFibonacciNumber(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n + "th fibonacci number is: " + nthFibonacciNumber(n));
        scan.close();
    }
}

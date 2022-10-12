package ApnaCollegePracticeQuestions.Recursion;

import java.util.*;

public class PrintDecreasingNumbers {
    public static void printDecreasingNumbers(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasingNumbers(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printDecreasingNumbers(n);
        scan.close();
    }
}

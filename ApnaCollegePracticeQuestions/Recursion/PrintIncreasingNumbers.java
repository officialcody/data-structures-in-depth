package ApnaCollegePracticeQuestions.Recursion;

import java.util.*;

public class PrintIncreasingNumbers {
    public static void printIncreasingNumbers(int n) {
        if(n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasingNumbers(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printIncreasingNumbers(n);
        scan.close();
    }
}

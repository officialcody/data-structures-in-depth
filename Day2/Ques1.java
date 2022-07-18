package Day2;

import java.util.Scanner;

// SUM of SERIES - NATURAL NUMBERS
public class Ques1 {
    static long seriesSum(int n) {
        return (long)((n*(n+1))/2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Sum of series till " + n + " is: " + seriesSum(n));
        scan.close();
    }
}

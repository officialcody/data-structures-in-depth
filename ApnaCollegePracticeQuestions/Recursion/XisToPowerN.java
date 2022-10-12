package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public class XisToPowerN {
    public static int calculateXToPowerN(int x, int n) {
        if(n == 0) {
            return 1;
        }
        return x * calculateXToPowerN(x, n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int xisToPowerN = calculateXToPowerN(x, n);
        System.out.println(x + " is to the power " + n + " is: " + xisToPowerN);
        scan.close();
    }
}

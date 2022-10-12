package ApnaCollegePracticeQuestions.Recursion;

import java.util.Scanner;

public class XisToPowerNOptimized {
    public static int calculateXToPowerN(int x, int n) {
        if(n == 0) {
            return 1;
        }
        int halfPower = calculateXToPowerN(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        if(n%2!=0) {
            halfPowerSq *= x;
        }
        return halfPowerSq;
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

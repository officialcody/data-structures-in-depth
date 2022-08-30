package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    // Hollow Rectangle
    public static void printHollowRectanglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0 || j == n || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printHollowRectanglePattern(n);
        scan.close();
    }
}

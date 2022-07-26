package Recursion;

import java.util.*;

public class Factorial {
    public static int factorial(int n){
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int factorial = factorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
        scan.close();
    }
}

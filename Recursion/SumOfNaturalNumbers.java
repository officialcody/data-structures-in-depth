package Recursion;

import java.util.*;

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n){
        if(n == 1) return 1;
        return n + sumOfNaturalNumbers(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("Factorial of " + n + " is: " + sum);
        scan.close();
    }
}

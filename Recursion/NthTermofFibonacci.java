package Recursion;

import java.util.*;

public class NthTermofFibonacci {
    public static int nthFibonacci(int number){
        if(number == 1|| number == 2) return 1;
        return nthFibonacci(number-1) + nthFibonacci(number-2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nthFibonacci = nthFibonacci(n);
        System.out.println(n + "th fibonacci number is: " + nthFibonacci);
        scan.close();
    }
}

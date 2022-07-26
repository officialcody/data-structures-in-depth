package Recursion;

import java.util.*;

public class PowerOfNumber {
    public static long power(int base, int power){
        if(power == 0) return 1;
        return base * power(base, power - 1);
    }

    public static long powerOptimized(int base, int power){
        if(power == 0) return 1;
        if(power%2 == 1) return power(base, power/2) * power(base, power/2) * base;
        return power(base, power/2) * power(base, power/2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int pow = scan.nextInt();
        long power = powerOptimized(base, pow);
        System.out.println("Value of " + base + " to the power of " + pow + " is: " + power);
        scan.close();
    }
}

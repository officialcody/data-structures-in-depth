package Recursion;

import java.util.*;

public class PowerOfNumber {
    public static int power(int base, int power){
        if(power == 0) return 1;
        return base * power(base, power - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        int pow = scan.nextInt();
        int power = power(base, pow);
        System.out.println("Value of " + base + " to the power of " + pow + " is: " + power);
        scan.close();
    }
}

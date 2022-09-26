package GFG.BitManipulation;

import java.util.Scanner;

public class IsPowerOfTwo {
    public static boolean isPowerOf2OrNot(int n){
        return (n & (n-1)) == 0 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(isPowerOf2OrNot(n)){
            System.out.println("It is power of 2");
        } else {
            System.out.println("It is not a power of 2");
        }
        scan.close();
    }
}

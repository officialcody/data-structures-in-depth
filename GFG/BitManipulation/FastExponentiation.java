package GFG.BitManipulation;

import java.util.Scanner;

public class FastExponentiation {
    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n&1)!=0){
                ans *= a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int n = scan.nextInt();
        int exp = fastExponentiation(a, n);
        System.out.println("EXP value is: " + exp);
        scan.close();
    }
}

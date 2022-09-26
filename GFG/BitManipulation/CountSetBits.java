package GFG.BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int answer = countSetBits(n);
        System.out.println("Number of set bits: " + answer);
        scan.close();
    }
}

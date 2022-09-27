package GFG.BitManipulation;

import java.util.Scanner;

public class XIsToThePowerX {
    public static int xistopowerx(int x){
        int ans = 1;
        int n = x;
        while(x > 0){
          if((x&1)!=0){
            ans *= n;
          }
          n = n * n;
          x = x >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int xistopowerx = xistopowerx(x);
        System.out.println("X is to power x is: "  + xistopowerx);
        scan.close();
    }
}

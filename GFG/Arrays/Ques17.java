package GFG.Arrays;

// How many pizzas?
import java.util.*;

public class Ques17 {
    public static int getCommon(int stack1[], int stack2[]) {
        int dp[][] = new int[11][11];
        for(int i = 0; i <= 10; i++){
           dp[i][0] = 0;
           dp[0][i] = 0;
        }
        for(int i = 1; i <= 10; i++){
           for(int j = 1; j <= 10; j++) {
               if(stack1[i-1] == stack2[j-1])
                   dp[i][j] = 1 + dp[i-1][j-1];
               else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
           }
        }
       return dp[10][10];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arr = new int[100000];
        for(int i=0;i<10;i++){
            arr[i] = scan.nextInt();
        }
        int [] brr = new int[100000];
        for(int i=0;i<10;i++){
            brr[i] = scan.nextInt();
        }
        scan.close();
    }
}

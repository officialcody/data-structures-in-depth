package GFG.Arrays;

// Longest Equal Prefix
import java.util.*;

public class Ques35 {
    public static long findIndex(long arr[] ,int X,int Y,int N) {
        int x=0;
        int y=0;
        int maxi=-1;
        for(int i=0;i<N;i++) {
            if (arr[i]==X) {
                x++;
            } else if (arr[i]==Y) {
                y++;
            }
            if(x==y && x>0 && y>0){
                maxi=Math.max(maxi,i);
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int x = scan.nextInt();
        int y = scan.nextInt();
        long answer = findIndex(arr, x, y, n);
        System.out.println("Longest Equal Prefix: " + answer);
        scan.close();
    }
}

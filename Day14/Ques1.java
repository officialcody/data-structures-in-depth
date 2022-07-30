package Day14;

// Longest Increasing SubArray
import java.util.*;

public class Ques1 {
    public static long lenOfLongIncSubArr(long arr[], long n) {
        if(n==1) return 1;
        int longest = 1;
        int max = 0;
        for(int i=0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                longest++;
            } else {
                longest = 1;
            }
            max = Math.max(max, longest);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] a = new long[10000000];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        long longestIncresingSubArray = lenOfLongIncSubArr(a, n);
        System.out.println("Length of the longest increasing subarray is: " + longestIncresingSubArray);
        scan.close();
    }
}

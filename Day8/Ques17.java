package Day8;

// Swap and Maximize
import java.util.*;

public class Ques17 {
    public static long maxSum(long arr[] ,int n) {
        long sum = 0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            sum = sum + Math.abs(arr[n-i-1] - arr[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr [] = new long[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer = maxSum(arr, n);
        System.out.println("Maximum Sum after rearranging is: " + answer);
        scan.close();
    }
}

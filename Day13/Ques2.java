package Day13;

// Minimum Difference among K elements
import java.util.*;

public class Ques2 {
    public static long minDiff(long a[] ,int N,int K) {
        Arrays.sort(a);
        long minDifference = Long.MAX_VALUE;
        int start = 0;
        int end = N - K;
        while(start <= end){
            minDifference = Math.min(minDifference, a[start+K-1] - a[start]);
            start++;
        }
        return minDifference;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int k = scan.nextInt();
        long minDifference = minDiff(arr, n, k);
        System.out.println("Minimum Difference is: " + minDifference);
        scan.close();
    }
}

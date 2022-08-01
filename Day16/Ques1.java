package Day16;

// Friendly Array
import java.util.*;

public class Ques1 {
    public static long sumOfMinAbsDifferences(long arr[] ,int N) {
        Arrays.sort(arr);
        long sum = 0;
        sum = arr[1] - arr[0];
        for(int i=1;i<N-1;i++){
            long left = arr[i] - arr[i-1];
            long right = arr[i+1] - arr[i];
            long min = (left < right) ? left : right;
            sum += min;
        }
        sum += arr[N-1] - arr[N-2];
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long sumOfMinAbsDifferences = sumOfMinAbsDifferences(arr, n);
        System.out.println("Sum of minimum absolute differences is: " + sumOfMinAbsDifferences);
        scan.close();
    }
}

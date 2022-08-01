package Day16;

// Minimum Product Pair
import java.util.*;

public class Ques2 {

    /**
     * Sort and calculate product of first two numbers
     * @param arr
     * @param n
     * @return
     */
    public long printMinimumProduct2(long arr[], long n) {
        Arrays.sort(arr);
        long ans = arr[0]*arr[1];
        return ans;
    }

    /***
     * Find smallest and second smallest numbers and return their product
     * @param arr
     * @param n
     * @return
     */
    public static long printMinimumProduct(long arr[], long n) {
        long smallest = Long.MAX_VALUE;
        long secondSmallest = Long.MAX_VALUE;
        for(int i=0;i<(int)n;i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if(arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return smallest * secondSmallest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long minimumProduct = printMinimumProduct(arr, n);
        System.out.println("Minimum Product is: " + minimumProduct);
        scan.close();
    }
}

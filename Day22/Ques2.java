package Day22;

// Minimize sum of alternate product after sorting
import java.util.*;

public class Ques2 {
    public static long altProduct(long arr[], long n) {
        Arrays.sort(arr);
        long sum = 0;
        long start = 0;
        long end = n - 1;
        while(start < end){
            sum = sum + arr[(int)start] * arr[(int)end];
            start++;
            end--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long altProduct = altProduct(arr, n);
        System.out.println("Sum of Alternate products after sorting is:" + altProduct);
        scan.close();
    }
}

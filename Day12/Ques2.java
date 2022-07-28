package Day12;

// Largest Product
import java.util.*;

public class Ques2 {
    public static long findMaxProduct(int A[], int n, int k) {
        long maxProduct = Long.MIN_VALUE;
        for(int i=0;i<=n-k;i++){
            long product=1;
            for(int j=i;j<i+k;j++){
                product *= A[j];
            }
            if(product > maxProduct){
                maxProduct = product;
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        long maxProduct = findMaxProduct(arr, n, k);
        System.out.println("Maximum product of subarray of " + k + " elements in array is: " + maxProduct);
        scan.close();
    }
}

package Day13;

// Minimum Product of K Numbers
import java.util.*;

public class Ques3 {
    public static int minProduct(int arr[], int n,int k){
        Arrays.sort(arr);
        long product = 1;
        for(int i=0;i<k;i++){
            product= (product * arr[i])%1000000007;
        }
        return (int)product%1000000007;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int minProduct = minProduct(arr, n, k);
        System.out.println("Minimum Product of " + k + " numbers is:" + minProduct);
        scan.close();
    }
}

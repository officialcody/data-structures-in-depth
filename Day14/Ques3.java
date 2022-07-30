package Day14;

// Maximum Triplet Sum in an array
import java.util.*;

public class Ques3 {
    public static int maxTripletSum(int a[], int n) {
        Arrays.sort(a);
        return a[n-1] + a[n-2] + a[n-3];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int maxTripletSum = maxTripletSum(arr, n);
        System.out.println("Maximum Triplet Sum in an array: " + maxTripletSum);
        scan.close();
    }
}

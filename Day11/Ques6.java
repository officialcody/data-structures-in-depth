package Day11;
// Permutations in Array
import java.util.*;

public class Ques6 {
    public static boolean isPossible(long a[], long b[], int n, long k) {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]+b[n-i-1] < k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long brr[] = new long[100000];
        for(int i=0;i<n;i++){
            brr[i] = scan.nextLong();
        }
        long k = scan.nextLong();
        if(isPossible(arr, brr, n, k)){
            System.out.println("Possible");
        } else {
            System.out.println("Not Possible");
        }
        scan.close();
    }
}

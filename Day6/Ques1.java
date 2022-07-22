package Day6;

// Maximize sum(arr[i]*i) of an Array
import java.util.*;

public class Ques1 {
    public static int Maximize(int arr[], int n) {
        Arrays.sort(arr);
        long sum = 0;
        int mod = (int)1e9 + 7;
        for(int i=0;i<n;i++){
            sum = (sum + (long)arr[i] * i)%mod;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int ans = Maximize(arr, n);
        System.out.println("Maximum sum of array is: " + ans);
        scan.close();
    }
}

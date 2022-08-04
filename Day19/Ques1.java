package Day19;

// Sum of f(a[i], a[j]) over all pairs in an array of n integers
import java.util.*;

public class Ques1 {
    public static int sum (int arr[], int n) {
        int ans = 0, psum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<n; i++){
            ans += i*arr[i] - psum;
            ans += hm.getOrDefault(arr[i] + 1, 0);
            ans -= hm.getOrDefault(arr[i] - 1, 0);
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            psum += arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        long sum = sum(arr, n);
        System.out.println("Sum of f(arr[i]-arr[j]) " + sum);
        scan.close();
    }
}

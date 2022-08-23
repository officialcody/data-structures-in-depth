package GFG;

// Maximum weight difference
import java.util.*;

public class Ques5 {
    public static long maximumWeightDifference(int[] arr, int n, int k) {
        Arrays.sort(arr);
        long selectedSum = 0;
        long remainingSum = 0;
        if(k <= n/2) {
            for(int i=0;i<n;i++){
                if(i < k){
                    selectedSum += arr[i];
                } else {
                    remainingSum += arr[i];
                }
            }
        } else {
            for(int i=0;i<n;i++){
                if(i < n-k){
                    selectedSum += arr[i];
                } else {
                    remainingSum += arr[i];
                }
            }
        }
        return (long)Math.abs(remainingSum - selectedSum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        long answer = maximumWeightDifference(arr, n, k);
        System.out.println("Maximum Weight difference is: " + answer);
        scan.close();
    }
}

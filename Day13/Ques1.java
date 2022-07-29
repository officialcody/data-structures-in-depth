package Day13;

// Reverse Sub Array with provided range of subarray
import java.util.*;

public class Ques1 {
    public static int[] reverseSubArray(int arr[], int n, int l, int r) {
        int start = l - 1;
        int end = r-1;
        
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int l = scan.nextInt();
        int r = scan.nextInt();
        int answer [] = reverseSubArray(arr, n, l, r);
        System.out.println("Reversed Array");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

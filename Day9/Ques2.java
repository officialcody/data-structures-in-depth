package Day9;

// Sum Array
import java.util.*;

public class Ques2 {
    public static int[] sumArray(int arr[], int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = sum - arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Original ARRAY");
        for(int i : arr){
            System.out.println(i + " ");
        }
        int [] answer = sumArray(arr, n);
        System.out.println("SUM ARRAY");
        for(int i : answer){
            System.out.println(i + " ");
        }
        scan.close();
    }
}

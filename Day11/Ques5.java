package Day11;

// Missing Number
import java.util.*;

public class Ques5 {
    public static int missingNumber(int A[], int N) {
         int sum = 0;
         int actualSum = 0;
         for(int i=0;i<N;i++){
             sum += A[i];
         }
         for(int i=1;i<=N;i++){
             actualSum += i;
         }
         return actualSum - sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int missingNumber = missingNumber(arr, n);
        System.out.println("Missing Number" + missingNumber);
        scan.close();
    }
}

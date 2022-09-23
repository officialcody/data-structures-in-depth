package GFG.Arrays;

// Minimum Sum of Absolute Differences of Pairs
import java.util.*;

public class Ques38 {
    public static long findMinSum(int[] A,int[] B,int N) { 
        Arrays.sort(A);
        Arrays.sort(B);
        long answer = 0;
        for(int i=0;i<N;i++){
            answer += (long)(Math.abs(A[i] - B[i]));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int brr [] = new int[100000];
        for(int i=0;i<n;i++){
            brr[i] = scan.nextInt();
        }
        long answer = findMinSum(arr, brr, n);
        System.out.println("Minimum sum of absolute difference is: " + answer);
        scan.close();
    }
}

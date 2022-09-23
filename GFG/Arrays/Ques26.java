package GFG.Arrays;

// Equalization of an array
import java.util.*;

public class Ques26 {
    public static long minOperations(long arr[], int N) {
        long sum = 0; 
        long avg = 0;
        long result = 0;
        for(long x : arr){
            sum += x;
        }
        
        avg = (long)(sum/N);
        
        if(sum != (avg * N)){
            return -1;
        }
        
        for(long x : arr){
            if(x < avg){
                result += (avg - x);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer = minOperations(arr, n);
        System.out.println("Minimum operations to equalize the array is: " + answer);
        scan.close();
    }
}

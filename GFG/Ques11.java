package GFG;

// Transform to prime
import java.util.*;

public class Ques11 {
    public static boolean isPrime(long num){
        long root = (long)Math.sqrt(num);
        for(long i=2; i<=root; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    
    public static long minNumber(long arr[], int N) {
        long sum = 0;
        for(long x : arr){
            sum += x;
        }
        
        if(sum <= 2){
            return 2-sum;
        }
        
        long counter = 0;
        while(true){
            if(isPrime(sum + counter)){
                return counter;
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long minNumberToMakeSumPrime = minNumber(arr, n);
        System.out.println("Minimum number is: " + minNumberToMakeSumPrime);
        scan.close();
    }
}

package GFG.Arrays;

// Stuffs Division
import java.util.*;

public class Ques20 {
    public static boolean possible(long arr[], long n) {
        long sum = 0;
        for(long num : arr){
            sum += num;
        }
        long requiredSum = n * (n + 1) / 2;
        return (sum == requiredSum) ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        boolean answer = possible(arr, n);
        if(answer){
            System.out.println("Yes it is possible");
        } else {
            System.out.println("It is not possible");
        }
        scan.close();
    }
}

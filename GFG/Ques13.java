package GFG;

// Max Odd Sum
import java.util.*;

public class Ques13 {
    public static long findMaxOddSubarraySum(long arr[] ,int n) {
        boolean isOdd = false;
        long sum = 0;
        long minimumOdd = Long.MAX_VALUE;
        for(long num : arr){
            if(num > 0){
                sum += num;
            }
            if(num%2!=0){
                isOdd = true;
                if(minimumOdd > Math.abs(num)){
                    minimumOdd = Math.abs(num);
                }
            }
        }
        if(sum % 2 == 0){
            sum = sum - minimumOdd;
        }
        return isOdd == false ? -1 : sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer = findMaxOddSubarraySum(arr, n);
        System.out.println("Max Odd Sum is: " + answer);
        scan.close();
    }
}

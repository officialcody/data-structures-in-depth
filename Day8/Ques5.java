package Day8;

// Fighting with Darkness
import java.util.*;

public class Ques5 {
    public static long maxDays(long arr[], int n){
        long max = Long.MIN_VALUE;
        for(long number : arr){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr [] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer = maxDays(arr, n);
        System.out.println("Maximum Days without darkness: " + answer);
        scan.close();
    }
}

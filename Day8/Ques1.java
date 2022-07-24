package Day8;

// Minimum value to balance an array
// Balanced Array

import java.util.*;

public class Ques1 {

    public static long minValueToBalance(long a[] ,int n)
    {
        long first = 0;
        long last = 0;
        for(int i=0;i<n;i++){
            if(i < n/2){
                first += a[i];
            } else {
                last += a[i];
            }
        }
        
        return (long) (Math.abs(first - last));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr [] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer = minValueToBalance(arr, n);
        System.out.println("Minimum value to make an array balanced is: " + answer);
        scan.close();
    }
}

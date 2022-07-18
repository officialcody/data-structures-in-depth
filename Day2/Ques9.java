package Day2;

import java.util.*;

public class Ques9 {
    public static long leftElement(long arr[], long n)
    {
        int mid = arr.length/2;
        Arrays.sort(arr);
        if(n%2==0){
            return arr[mid-1];
        } else {
            return arr[mid];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        System.out.println("last element left after removing max and min alternatively is: " + leftElement(arr, n));
        scan.close();
    }
}

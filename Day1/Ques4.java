

import java.util.*;

// Sum of elements in Array
public class Ques4 {
    public static long getSum(long a[], long n)
    {
        long sum = 0;
        for(int number=0;number<n;number++){
            sum += a[number];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long arr[] = new long[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        long secondLargest = getSum(arr, n);
        System.out.println("Sum of elements in array is: " + secondLargest);
        scan.close();
    }
}

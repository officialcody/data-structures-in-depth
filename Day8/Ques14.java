package Day8;

// Total Count

/**
 * Given an array Arr of N positive integers and a number K where K is used as a threshold
 * value to divide each element of the array into sum of different numbers. Find the sum of 
 * count of the numbers in which array elements are divided.
 * 
 * Input:
 *  N = 4, K = 3
 *  Arr[] = {5, 8, 10, 13}
 * Output: 14
 *  Explanation: Each number can be expressed as sum 
 *  of different numbers less than or equal to K as
 *  5 (3 + 2), 8 (3 + 3 + 2), 10 (3 + 3 + 3 + 1), 
 *  13 (3 + 3 + 3 + 3 + 1). So, the sum of count 
 *  of each element is (2+3+4+5)=14.
 * 
 */
import java.util.*;

public class Ques14 {
    public static int totalCount(int[] arr, int n, int k) {
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%k==0){
                count += arr[i]/k;
            } else {
                count += arr[i]/k+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int totalCount = totalCount(arr, n, k);
        System.out.println("Sum of count of numbers in which array elements are divided is: " + totalCount);
        scan.close();
    }
}

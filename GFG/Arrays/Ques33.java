package GFG.Arrays;

// Elements before which no element is bigger
import java.util.*;

public class Ques33 {
    public static long countElements(long arr[], long n) {
        long count = 1;
        long max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max){
                max = Math.max(max, arr[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer = countElements(arr, n);
        System.out.println("Number of elements before which all the elements are smaller: " + answer);
        scan.close();
    }
}

package Day8;

// Index of first 1 in a sorted array of 0s and 1s
import java.util.*;

public class Ques11 {
    public static long firstIndex(long arr[], long n) {
        long start = 0;
        long end = n - 1;
        long pos = -1;
        while(start <= end){
            int mid = (int) (start + (end - start)/2);
            if(arr[mid] == 1){
                pos = mid;
                end = mid -1;
            } else if(arr[mid] == 0){
                start = mid + 1;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long firstIndex = firstIndex(arr, n);
        if(firstIndex == -1){
            System.out.println("All elements are 0's");
        } else {
            System.out.println("First index of 1 in array is: " + firstIndex);
        }
        scan.close();
    }
}

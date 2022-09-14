package GFG;

// Check if array is sorted
import java.util.*;

public class Ques47 {
    public static boolean arraySortedOrNot(int[] arr, int n) {
        boolean isSorted = true;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        return isSorted;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        boolean isSorted = arraySortedOrNot(arr, n);
        if(isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }
        scan.close();
    }
}

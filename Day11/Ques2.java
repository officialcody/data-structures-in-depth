package Day11;

// Magical Number
import java.util.*;

public class Ques2 {
    public static int binarySearch(int arr[], int low, int high) {
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == mid){
                return mid;
            } else if(arr[mid] < mid){
                low = mid+1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = binarySearch(arr, 0, n-1);
        System.out.println("Magical Number is: " + answer);
        scan.close();
    }
}

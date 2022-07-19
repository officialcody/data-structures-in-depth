package Day3;

// BINARY SEARCH
import java.util.Scanner;

public class Ques1 {
    public static int binarysearch(int arr[], int n, int k) {
        int start = 0;
        int end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == k){
                return mid;
            } else if(k > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int ans = binarysearch(arr, n, k);
        if(ans == -1){
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("The element " + k + " is at index " + ans);
        }
        scan.close();
    }
}

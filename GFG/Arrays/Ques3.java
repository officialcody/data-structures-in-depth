package GFG.Arrays;

// Stable Sort and Position
import java.util.*;

public class Ques3 {
    public static long getIndexInSortedArray(long arr[], int n,int index) {
        long counter = 0;
        for(int i=0; i<index; i++){
            if(arr[i] <= arr[index]){
                counter++;
            }
        }
        for(int i=index+1; i<n; i++){
            if(arr[i] < arr[index]){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int x = scan.nextInt();
        long answer = getIndexInSortedArray(arr, n, x);
        System.out.println("Answer " + answer);
        scan.close();
    }
}

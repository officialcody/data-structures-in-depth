package GFG.Arrays;

// Rotate Array
import java.util.*;

public class Ques39 {
    public static void rotateArr(int arr[], int d, int n) {
        if(d > n){
            d = d % n;
        }
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n-1);
    }
    
    public static void reverseArray(int [] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        rotateArr(arr, d, n);
        System.out.println("After rotation");
        for(int num : arr){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

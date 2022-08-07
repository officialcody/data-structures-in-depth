package Recursion;

import java.util.*;

public class ReverseArray {
    public static int[] reverseArrayHelper(int arr[], int left, int right){
        // Base Condition - Step 1
        if(left >= right) return arr;

        // Task to be done - Step 2
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Ask Recursion to handle the rest of the task - Step 3
        return reverseArrayHelper(arr, left+1, right-1);
    }

    public static int[] reverseArray(int arr[], int size){
        return reverseArrayHelper(arr, 0, size-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = reverseArray(arr, n);
        System.out.println("Reversed Array is");
        for(int num : answer){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

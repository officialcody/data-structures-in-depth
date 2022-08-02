package Sorting;

// Insertion Sort
// Time Complexity -> O(N^2)
// Space Complexity -> O(1)

import java.util.*;

public class InsertionSort {
    
    public static int[] insertionSort(int [] arr, int n){
        for(int i=1;i<n;i++){
            int j = i - 1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp){
                arr[j+1] =arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Before sorting");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int sortedArray [] = insertionSort(arr, n);
        System.out.println("After sorting");
        for(int i : sortedArray){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

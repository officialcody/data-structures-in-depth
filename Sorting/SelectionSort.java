package Sorting;

// Selection Sort
// Time Complexity -> O(N^2)

import java.util.*;

public class SelectionSort {
    public static int[] selectionSort(int arr [], int n){
        for(int i=0;i<n-1;i++){
            int minimum = arr[i];
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[j] < minimum){
                    minimum = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = minimum;
            }
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
        System.out.println("Original Array");
        for(int i : arr){
            System.out.println(i + " ");
        }
        int sortedArray [] = selectionSort(arr, n);
        System.out.println("Sorted Array");
        for(int i : sortedArray){
            System.out.println(i + " ");
        }
        scan.close();
    }
}

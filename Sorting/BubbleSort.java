package Sorting;

// Bubble Sort
// Time Complexity -> O(N^2)
// Space Complexity -> O(1)

import java.util.*;

public class BubbleSort {

    public static int[] bubbleSort(int [] arr, int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;i++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                }
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
        System.out.println("Before sorting");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int sortedArray [] = bubbleSort(arr, n);
        System.out.println("After sorting");
        for(int i : sortedArray){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

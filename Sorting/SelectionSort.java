package Sorting;

// Selection Sort
// Time Complexity -> O(N^2)
// Space Complexity -> O(1)

/**
 * A sorting algorithm is said to be stable if two objects with equal or same keys appear in the same order in sorted 
 * output as they appear in the input array to be sorted. Any comparison based sorting algorithm which is not stable by 
 * nature can be modified to be stable by changing the key comparison operation so that the comparison of two keys 
 * considers position as a factor for objects with equal key or by tweaking it in a way such that its meaning doesn’t 
 * change and it becomes stable as well.
 *      Example :
 * 
 * This is what simple selection sort produces
 * Input : 4A 5 3 2 4B 1
 * Output : 1 2 3 4B 4A 5
 * 
 * Stable Selection Sort should have produced
 * Output : 1 2 3 4A 4B 5
 * 
 * Selection sort works by finding the minimum element and then inserting it in its correct position by swapping with 
 * the element which is in the position of this minimum element. This is what makes it unstable. Swapping might impact 
 * in pushing a key(let’s say A) to a position greater than the key(let’s say B) which are equal keys. which makes them 
 * out of desired order. In the above example 4A was pushed after 4B and after complete sorting this 4A remains after 
 * this 4B. Hence resulting in unstability. Selection sort can be made Stable if instead of swapping, the minimum element 
 * is placed in its position without swapping i.e. by placing the number in its position by pushing every element one 
 * step forward. In simple terms use a technique like insertion sort which means inserting element in its correct place.
 * 
 * 
 */

import java.util.*;

public class SelectionSort {

    /**
     * Unstable selection sort
     * @param arr
     * @param n
     * @return
     */
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

    public static int[] stableSelectionSort(int [] arr, int n){
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;i<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int key = arr[minIndex];
            while(minIndex > i){
                arr[minIndex] = arr[minIndex - 1];
                minIndex--;
            }
            arr[i] = key;
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

package Algorithms;

import java.util.*;

/***
 * DUTCH NATIONAL FLAG ALGORITHM
 * 
 * Sort an array of 0s, 1s and 2s
 * 
 * QUES: Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 * 
 * Input: 
 *  N = 5
 *  arr[]= {0 2 1 2 0}
 * Output:
 *  0 0 1 2 2
 * Explanation:
 *  0s 1s and 2s are segregated into ascending order.
 * 
 */
public class DutchFlagAlgorithm {
    /***
     * 
     * @param a array containing only 0's, 1's and 2's
     * @param n size of array
     */
    public static void sort012(int a[], int n) {
        int start = 0;
        int p = 0;
        int end = n - 1;
        while(p <= end){
            if(a[p] == 0){
                int temp = a[p];
                a[p] = a[start];
                a[start] = temp;
                start++;
                p++;
            } else if(a[p] == 1){
                p++;
            } else {
                int temp = a[p];
                a[p] = a[end];
                a[end] = temp;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        sort012(arr, n);
        System.out.println("After sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

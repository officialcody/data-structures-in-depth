package GFG.Arrays;

// Immediate Smaller Element

// Given an integer array Arr of size N. For each element in the array, check whether the right adjacent element 
// (on the next immediate position) of the array is smaller. If next element is smaller, update the current index 
// to that element. If not, then  -1.

import java.util.*;

public class Ques1 {
    public static int[] immediateSmaller(int arr[], int n) {
        int start = 0;
        int next = 1;
        while(next < n) {
            if(arr[start] > arr[next]){
                arr[start] = arr[next];
            } else {
                arr[start] = -1;
            }
            start++;
            next++;
        }
        arr[n-1] = -1;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = immediateSmaller(arr, n);
        System.out.println("Answer");
        for(int num : answer){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

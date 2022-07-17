package Day1;

import java.util.*;

// Second Largest Element in Array

public class Ques3 {
    public static int print2largest(int arr[], int n) {
        int largest = -1;
        int secondLargest = -1;
        
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int secondLargest = print2largest(arr, n);
        System.out.println("Second largest Element is: " + secondLargest);
        scan.close();
    }
}

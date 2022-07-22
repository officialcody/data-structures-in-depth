package Day6;

// Constructing a Zig-Zag Array

import java.util.*;

class Ques10 {
    public static void zigZag(int arr[], int n) {
        for(int i=0;i<n-1;i++){
            if(i%2==0 && arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            } else if(i%2!=0 && arr[i] < arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
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
        System.out.println("Array before conversion into zigzag");
        for(int i: arr){
            System.out.println(i + " ");
        }
        zigZag(arr, n);
        System.out.println("Array after conversion into zigzag");
        for(int i: arr){
            System.out.println(i + " ");
        }
        scan.close();
    }
}
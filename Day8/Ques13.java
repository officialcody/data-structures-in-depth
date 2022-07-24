package Day8;

// Rotating array towards left given number of times

import java.util.*;

public class Ques13 {
    public static void leftRotate(int[] arr, int n, int d) {
        int [] rotate = new int[d];
        for(int i=0;i<d;i++){
            rotate[i] = arr[i];
        }
        for(int i=0;i<n-d;i++){
            arr[i] = arr[i+d];
        }
        for(int i=0;i<d;i++){
            arr[n-d+i] = rotate[i];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int d = scan.nextInt();
        System.out.println("Array before rotating");
        for(int i : arr){
            System.out.print(i + " ");
        }
        leftRotate(arr, n, d);
        System.out.println("Array after rotating");
        for(int i : arr){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

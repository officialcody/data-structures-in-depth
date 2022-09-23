package GFG.Arrays;

// Need Some Change
import java.util.*;

public class Ques48 {
    public static void swapElements(int[] arr, int n) {
        for(int i=0;i<n-2;i++){
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        swapElements(arr, n);
        System.out.println("After swapping:");
        for(int i : arr) {
            System.out.print(i + " ");
        }
        scan.close();
    }
}

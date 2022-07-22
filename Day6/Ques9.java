package Day6;

// XOR of consecutive elements of an array

import java.util.*;

public class Ques9 {
    public static int[] game_with_number (int arr[], int n) {
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i]^arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Array before conversion into XOR ");
        for(int i: arr){
            System.out.println(i + " ");
        }
        int [] answer = game_with_number(arr, n);
        System.out.println("Array after conversion into XOR ");
        for(int i: answer){
            System.out.println(i + " ");
        }
        scan.close();
    }
}

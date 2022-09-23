

import java.util.*;

// Print alternate elements of an array

public class Ques1 {

    public static void printAlternateNumbers(int arr [], int n) {
        for(int i=0;i<n;i=i+2){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        printAlternateNumbers(arr, n);
        scan.close();
    }
}

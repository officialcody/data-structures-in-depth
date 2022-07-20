package Day4;

import java.util.Scanner;

public class Ques2 {
    public static int largest(int arr[], int n)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int largest = largest(arr, n);
        System.out.println("Largest Element is: " + largest);
        scan.close();
    }
}

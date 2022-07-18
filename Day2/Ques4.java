package Day2;

// SWAP Kth elements from start and end
import java.util.Scanner;

public class Ques4 {
    static void swapKth(int arr[], int n, int k) {
        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        swapKth(arr, n, k);
        for(int i: arr){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

package GFG.Arrays;

// Minimum move to front operations
import java.util.*;

public class Ques32 {
    public static int minMoves(int arr[], int n) {
        int minimumMoves = n;
        for (int i=n-1; i >= 0; i--) {
            if (arr[i] == minimumMoves) { 
               minimumMoves--;
            }
        }
        return minimumMoves;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int minimumMoves = minMoves(arr, n);
        System.out.println("Minimum Moves: " + minimumMoves);
        scan.close();
    }
}

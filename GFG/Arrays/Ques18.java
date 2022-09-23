package GFG.Arrays;

// Reducing Walls
import java.util.*;

class Ques18 {
    public static int ReducingWalls (int arr[], int n, int k) {
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > k){
                count += (arr[i]-1)/ k;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int answer = ReducingWalls(arr, n, k);
        System.out.println("Minimum number of times required to use superpower: " + answer);
        scan.close();
    }
}
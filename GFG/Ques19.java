package GFG;

// Why is Melody so chocolaty?
import java.util.*;

public class Ques19 {
    public static int max_adjacent_sum (int arr[], int n) {
        int maxHappiness = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            if(arr[i] + arr[i+1] > maxHappiness){
                maxHappiness = arr[i] + arr[i+1];
            }
        }
        return maxHappiness;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = max_adjacent_sum(arr, n);
        System.out.println("Max Happiness: " + answer);
        scan.close();
    }
}

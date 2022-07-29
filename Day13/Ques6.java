package Day13;

// Find the closest number
import java.util.*;

public class Ques6 {
    public static int findClosest(int arr[], int n, int target) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0;i<n;i++){
            if(min >= Math.abs(arr[i] - target)){
                min = Math.abs(arr[i] - target);
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int closest = findClosest(arr, n, target);
        System.out.println("Closest number to " + target + " in array is: " + closest);
        scan.close();
    }
}

package GFG.Arrays;

// Find Transition Point
import java.util.*;

public class Ques43 {
    public static int transitionPoint(int arr[], int n) {
        if(n == 1 && arr[0] == 1) return 0;
        if(n == 1 && arr[0] == 0) return -1;
        int answer = -1;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == 1){
                answer = mid;
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = transitionPoint(arr, n);
        if(answer == -1 && answer == 0){
            System.out.println("No transition point");
        } else {
            System.out.println("Transition point is: " + answer);
        }
        scan.close();
    }
}

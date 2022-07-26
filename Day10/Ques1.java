package Day10;

// Greater on right side
import java.util.*;

public class Ques1 {
    public static int[] nextGreatest(int arr[], int n) {
        int greatest = -1;
        for(int i=n-1;i>=0;i--){
            if(arr[i] > greatest){
                int temp = arr[i];
                arr[i] = greatest;
                greatest = temp;
            } else {
                arr[i] = greatest;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = nextGreatest(arr, n);
        for(int i: answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

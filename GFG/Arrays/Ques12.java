package GFG.Arrays;

// Print an array in Pendulum Arrangement
import java.util.*;

public class Ques12 {
    public static int[] pendulumArrangement(int arr[], int n) {
        Arrays.sort(arr);
        int start = 0;
        int end = n - 1;
        int [] answer = new int[n];
        int pos = n - 1;
        while(pos >= 0){
            if(pos%2==0){
                answer[start] = arr[pos];
                start++;
                pos--;
            } else {
                answer[end] = arr[pos];
                end--;
                pos--;
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
        int [] answer = pendulumArrangement(arr, n);
        System.out.println("Pendulum Arrangement");
        for(int i: answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

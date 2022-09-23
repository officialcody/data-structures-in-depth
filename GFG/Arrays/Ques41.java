package GFG.Arrays;

// Equilibrium Point
import java.util.*;

public class Ques41 {
    public static int equilibriumPoint(long arr[], int n) {
        if(n == 1) return 1;
        long totalSum = 0;
        for(int i=0;i<n;i++){
            totalSum += arr[i];
        }
        long leftOverSum = 0;
        for(int i=0;i<n;i++){
            totalSum -= arr[i];
            if(leftOverSum == totalSum){
                return i+1;
            }
            leftOverSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr [] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int answer = equilibriumPoint(arr, n);
        if(answer == -1){
            System.out.println("No Equilibrium Point found");
        } else {
            System.out.println("Equilibrium Point is: " + answer);
        }
        scan.close();
    }
}

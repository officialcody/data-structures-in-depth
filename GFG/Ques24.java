package GFG;

// Perfect Array
import java.util.*;

public class Ques24 {
    public static boolean checkUnimodal(int arr[], int n) {
        int i=1;
        while(i<n && arr[i-1]<arr[i]){
           i++;
        }
        while(i<n && arr[i-1]==arr[i]){
           i++;
        }
        while(i<n &&  arr[i-1]>arr[i]){
           i++;
        }
        return i == n ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
    }
}

package Day13;

// The problem of identical Arrays
import java.util.*;

public class Ques7 {
    public static int checkArraysIdentical(int arr[], int[] brr, int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        for(int i=0;i<n;i++){
            if(arr[i] != brr[i]){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] brr = new int[10000000];
        for(int i=0;i<n;i++){
            brr[i] = scan.nextInt();
        }

        int answer = checkArraysIdentical(arr, brr, n);
        if(answer == 0){
            System.out.println("Arrays are not identical");
        } else {
            System.out.println("Arrays are identical");
        }
        scan.close();
    }
}

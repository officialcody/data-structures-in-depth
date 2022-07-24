package Day8;

// Immediate Smaller Element
import java.util.*;

public class Ques8 {
    public static void immediateSmaller(int arr[], int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i+1] < arr[i]){
                arr[i] = arr[i+1];
            } else {
                arr[i] = -1;
            }
        }
        arr[n-1] = -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Array before changing");
        for(int i : arr){
            System.out.print(i + " ");
        }
        immediateSmaller(arr, n);
        System.out.println("Array after changing");
        for(int i : arr){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

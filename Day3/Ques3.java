package Day3;

// Cyclically rotate an array by one
import java.util.*;

public class Ques3 {
    public static void rotate(int arr[], int n)
    {
        int element = n-1;
        while(element!=0){
            int temp = arr[element];
            arr[element] = arr[element-1];
            arr[element-1] = temp;
            element--;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Array before rotation");
        for(int i: arr){
            System.out.print(i+" ");
        }
        rotate(arr, n);
        System.out.println("Array after rotation");
        for(int i: arr){
            System.out.print(i+" ");
        }
        scan.close();
    }
}

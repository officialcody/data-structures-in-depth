package Day9;

// Quick Left Rotate
import java.util.*;

public class Ques1 {

    public static void leftRotateOptimized(int arr[], int k, int n)  {
        k = k%n;
        
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    } 

    public static void reverse(int arr[], int low , int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static void leftRotate(long arr[], int k,int n) {
        ArrayList<Long> al = new ArrayList<Long>();
        for(int i=k%n;i<n;i++){
            al.add(arr[i]);
        }
        
        for(int i=0;i<k%n;i++){
            al.add(arr[i]);
        }
        
        for(int i=0;i<n;i++){
            arr[i] = al.get(i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr [] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int k = scan.nextInt();
        System.out.println("Array before rotation");
        for(long i : arr){
            System.out.print(i + " ");
        }
        leftRotate(arr, k, n);
        System.out.println("Array after rotation");
        for(long i : arr){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

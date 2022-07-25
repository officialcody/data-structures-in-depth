package Day9;

// Maximum product of two numbers in an array
import java.util.*;

class Ques3 {

    public static int maxProductWithSorting(int arr[], int n) {
        Arrays.sort(arr);
        return arr[n-1] * arr[n-2];
    }

    public static int maxProduct(int arr[], int n) {
        int max=0;
        int secMax=0;
        for(int i=0;i<n;i++) {
            if(max<arr[i]) {
                secMax=max;
                max=arr[i];
            }
            else if(secMax<arr[i] ) {
                secMax=arr[i];
            }
        }
        return max*secMax;
     }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int maximumProduct = maxProduct(arr, n);
        System.out.println("Maximum Product => " + maximumProduct);
        scan.close();
    }
}
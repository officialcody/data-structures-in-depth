package Day22;

// Stange Sort
import java.util.*;

public class Ques1 {
    public static int[] strangeSort (int A[], int N, int K) {
       int temp = A[K-1];
       
       A[K-1] = -1;
       
       Arrays.sort(A);
       
       for(int i=0; i<K-1; i++){
           A[i] = A[i+1];
       }
       A[K-1] = temp;
       return A;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int [] answer = strangeSort(arr, n, k);
        System.out.println("After sorting strangely");
        for(int num : answer){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

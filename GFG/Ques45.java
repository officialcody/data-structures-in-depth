package GFG;

// Remove duplicate elements from sorted Array
import java.util.*;

public class Ques45 {
    public static int remove_duplicate(int A[],int N){
        int pos = 1;
        for(int i=1;i<N;i++){
            if(A[pos-1] != A[i]){
                A[pos] = A[i];
                pos++;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = remove_duplicate(arr, n);
        System.out.println("After removing: " + answer);
        scan.close();
    }
}

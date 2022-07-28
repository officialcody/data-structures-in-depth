package Day12;
// Check MAX HEAP
import java.util.*;

public class Ques6 {
    public static boolean checkMaxHeap(long arr[], long n) {
        for(long i=0; i<=n/2; i++){
            long index = i*2 + 1;
            if(index < n){
                if(arr[(int)i] < arr[(int)index]){
                    return false;
                }
            }
            if(index + 1 < n){
                if(arr[(int)i] < arr[(int)index + 1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        boolean ans = checkMaxHeap(arr, n);
        if(ans){
            System.out.println("Its a Max Heap");
        } else {
            System.out.println("Its not a Max Heap");
        }
        scan.close();
    }
}

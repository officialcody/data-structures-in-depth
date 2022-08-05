package Day20;

// Partition Point in the array
import java.util.*;

public class Ques4 {
    public static long FindElement(long arr[], int N) {
        long[] arr1=new long[N];
       long[] arr2=new long[N];
       long max=Long.MIN_VALUE; 
       long min=Long.MAX_VALUE;
       for(int i=0; i<N; i++){
           max=Math.max(max,arr[i]);
           arr1[i]=max;
       }
       for(int i=N-1; i>=0; i--){
           min=Math.min(min,arr[i]);
           arr2[i]=min;
       }
       for(int i=0; i<N; i++){
           if((i==0 || arr[i]>arr1[i-1]) && (i==N-1 || arr[i]<arr2[i+1])){
               return arr[i];
           } 
       }
       return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long [] A = new long[10000000];
        for(int i=0;i<N;i++){
            A[i] = scan.nextLong();
        }
        long firstElement = FindElement(A, N);
        System.out.println("First element with all left small and all right big is: " + firstElement);
        scan.close();
    }
}

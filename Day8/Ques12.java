package Day8;

// Smallest and Second smallest element in an array
import java.util.Scanner;

public class Ques12 {
    public static long[] minAnd2ndMin(long a[], long n){
        long min = Long.MAX_VALUE;
        long smin = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = (long) Math.min(min, a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]!=min){
                smin = (long)Math.min(smin, a[i]);
            }
        }
        
        if(smin == Long.MAX_VALUE || min == Long.MAX_VALUE){
            return new long[]{-1,-1};
        } else {
            return new long[]{min, smin};
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long [] answer = minAnd2ndMin(arr, n);
        System.out.println("Smallest element is: " + answer[0]);
        System.out.println("Smallest element is: " + answer[1]);
        scan.close();
    }
}

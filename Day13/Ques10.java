package Day13;

// A guy with a mental problem
import java.util.*;

public class Ques10 {
    public static long minTime(long a[], long b[], long n) {
        long minTotalTimeA = 0;
        long minTotalTimeB = 0;
        for(int i=0;i<(int)n;i++){
            if(i % 2 == 0){
                minTotalTimeA += a[i];
            } else {
                minTotalTimeA += b[i];
            }
        }
        for(int i=0;i<(int)n;i++){
            if(i % 2 == 0){
                minTotalTimeB += b[i];
            } else {
                minTotalTimeB += a[i];
            }
        }
        return (long) Math.min(minTotalTimeA, minTotalTimeB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] a = new long[10000000];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        long [] b = new long[10000000];
        for(int i=0;i<n;i++){
            b[i] = scan.nextInt();
        }
        long minTime = minTime(a, b, n);
        System.out.println("Minimum time to reach home is: " + minTime);
        scan.close();
    }
}

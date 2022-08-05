package Day20;

// Reading Books
import java.util.*;

public class Ques3 {
    public static long maxPoint(int N, long K, long A[], long B[]) {
        long max = Long.MIN_VALUE;
        for(int i=0;i<N;i++){
            long points = (int)(K/A[i]) * B[i];
            if(points >max){
                max = points;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long [] A = new long[10000000];
        for(int i=0;i<N;i++){
            A[i] = scan.nextLong();
        }
        long [] B = new long[10000000];
        for(int i=0;i<N;i++){
            B[i] = scan.nextLong();
        }
        long K = scan.nextLong();
        long maxPoints = maxPoint(N, K, A, B);
        System.out.println("Maximum points that he can gain are: " + maxPoints);
        scan.close();
    }
}

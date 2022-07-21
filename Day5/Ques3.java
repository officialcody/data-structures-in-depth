package Day5;

// Check whether arrays are equal or not
import java.util.*;

public class Ques3 {
    public static boolean check(long A[],long B[],int N) {
        Arrays.sort(A);
        Arrays.sort(B);
        boolean areEqual = true;
        for(int i=0;i<N;i++){
            if(A[i] != B[i]){
                areEqual = false;
                break;
            }
        }
        return areEqual;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        long [] A = new long[100000];
        long [] B = new long[100000];
        for(int i=0;i<n;i++){
            A[i] = scan.nextLong();
        }
        for(int i=0;i<n;i++){
            B[i] = scan.nextLong();
        }
        if(check(A, B, n)){
            System.out.println("Arrays are equal");
        } else{
            System.out.println("Arrays are not equal");
        }

        scan.close();
    }
}

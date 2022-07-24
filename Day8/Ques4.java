package Day8;

// Minimize the product of two arrays
import java.util.*;

public class Ques4 {
    public static long minValue(long a[], long b[], long n) {
        Arrays.sort(a);
        Arrays.sort(b);
        long sum = 0;
        for(int i=0;i<n;i++){
            sum += a[(int)i] * b[(int)n-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long a [] = new long[100000];
        for(int i=0;i<n;i++){
            a[i] = scan.nextLong();
        }
        long b [] = new long[100000];
        for(int i=0;i<n;i++){
            b[i] = scan.nextLong();
        }
        long minValue = minValue(a, b, n);
        System.out.println("Minimum sum of product is: " + minValue);
        scan.close();
    }
}

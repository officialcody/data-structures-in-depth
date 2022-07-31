package Day15;

// Missing number in shuffled array
import java.util.*;

public class Ques10 {

    /**
     * Sort and find odd one out
     * @param a
     * @param b
     * @param n
     * @return
     */
    public static long findMissing1(long a[], long b[], int n) {
        Arrays.sort(a);
        Arrays.sort(b);
        long answer = 0;
        for(int i=0;i<n;i++){
            if(a[i] != b[i]){
                answer = a[i];
            }
        }
        return answer;
    }

    /**
     * XOR of each element of first and second array
     * @param a
     * @param b
     * @param n
     * @return
     */
    public static long findMissing2(long a[], long b[], int n) {
        long xor =0;
        
        for(int i=0;i<a.length;i++){
            xor = xor ^ a[i];
        }
        
        for(int i=0;i<b.length;i++){
            xor = xor ^ b[i];
        }
        
        return xor;
    }

    /***
     * Calculate sum of array1 and subtract each element of array2 from that sum
     * @param a
     * @param b
     * @param n
     * @return
     */
    public static long findMissing(long a[], long b[], int n) {
        long s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }   
        for(int i=0;i<b.length;i++){
            s-=b[i];
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long [] brr = new long[10000000];
        for(int i=0;i<n;i++){
            brr[i] = scan.nextLong();
        }
        long missingNumber = findMissing(arr, brr, n);
        System.out.println("Missing number is: " + missingNumber);
        scan.close();
    }
}

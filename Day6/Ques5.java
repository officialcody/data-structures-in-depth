package Day6;

// Product of an array elements under a given modulo
import java.util.*;

public class Ques5 {
    public static Long product(Long arr[], Long mod, int n) {
        if (n==0) { 
            return (long)1;
        }
        long product = 1;
        for(int i=0;i<n;i++){
            product = (product*arr[i])%mod;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Long [] arr = new Long[100000];
        Long mod = scan.nextLong();
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        Long answer = product(arr, mod, n);
        System.out.println("Product with modulo is: " + answer);
        scan.close();
    }
}

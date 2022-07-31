package Day15;

// Form largest number from digits
import java.util.*;

public class Ques8 {
    public static String MaxNumber(long arr[], long n) {
        StringBuilder str=new StringBuilder();
       Arrays.sort(arr);
       for(int i=0; i<arr.length; i++){
           str.append(arr[i]);
       }
       return str.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        String answer = MaxNumber(arr, n);
        System.out.println("Largest Number is: " + answer);
        scan.close();
    }
}

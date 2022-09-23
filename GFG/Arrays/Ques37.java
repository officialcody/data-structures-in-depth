package GFG.Arrays;

// Missing number in array
import java.util.*;

public class Ques37 {
    public static int missingNumber(int array[], int n) {
        int xor = 0;
        for(int i=0;i<n-1;i++){
            xor = xor ^ array[i];
        }
        int actualXOR = 0;
        for(int i=1;i<=n;i++){
            actualXOR = actualXOR ^ i;
        }
        return xor ^ actualXOR;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int missingNumber = missingNumber(arr, n);
        System.out.println("Missing Number is: " + missingNumber);
        scan.close();
    }
}

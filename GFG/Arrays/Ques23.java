package GFG.Arrays;

// Make Co-prime Array
import java.util.*;

public class Ques23 {
    public static int isNotCoPrime(int x, int y){
        if(x < 2 || y < 2){
            return 0;
        }
        
        do{
            int temp = x%y;
            x = y;
            y = temp;
        }while(y != 0);
        
        return (x==1) ? 0 : 1;
        
    }

    public static int getGCD(int a, int b){
        if(a == 0){
            return b;
        }
        return getGCD(b%a, a);
    }
    
    public static int countCoPrime(int a[], int n) {
        int count = 0;
        for(int i=0;i<n-1;i++){
            count += isNotCoPrime(a[i], a[i+1]);
        }
        // Approach - 2
        // for(int i=0;i<n-1;i++){
        //     if(getGCD(a[i], a[i+1]) != 1){
        //         count++;
        //     }
        // }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int minNumbersToMakeArrayCoprime = countCoPrime(arr, n);
        System.out.println("Minimum numbers to insert to make the array of co primes is: " + minNumbersToMakeArrayCoprime);
        scan.close();
    }
}

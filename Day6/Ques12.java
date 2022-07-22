package Day6;

// Ishaan Loves Chocolates
import java.util.*;

public class Ques12 {
    public static int chocolates(int n, int[] arr) {
        int minimumTaste = Integer.MAX_VALUE;
        for(int i =0;i<n; i++){
            if(arr[i] < minimumTaste){
                minimumTaste = arr[i];
            }
        }
        return minimumTaste;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int minimumTaste = chocolates(n, arr);
        System.out.println("Ishaan's Sister gets chocolate square with tastiness " + minimumTaste);
        scan.close();
    }
}

package Day21;

// Mega Sale
import java.util.*;

public class Ques2 {
    public static long maxProfit(int a[], int n, int m) {
        long sum = 0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i] < 0 && m > 0){
                sum +=(long) Math.abs(a[i]);
                m--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int m = scan.nextInt();
        long maxProfit = maxProfit(arr, n, m);
        System.out.println("Maximum profit he can earn is: " + maxProfit);
        scan.close();
    }
}

package Day12;

// Shuffle Integers
import java.util.*;

public class Ques1 {
    public static long[] shuffleArray(long arr[], int n) {
        long a[] = new long[n];
        int j=0;
        int k = n/2;
        for(int i=0;i<n;i+=2){
            a[i] = arr[j];
            a[i+1] = arr[k];
            j++;
            k++;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }

        long answer [] = shuffleArray(arr, n);
        System.out.println("Shuffled Array");
        for(long i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

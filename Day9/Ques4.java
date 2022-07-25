package Day9;

// Rearrange Array 
import java.util.*;

public class Ques4 {
    public static long[] rearrange(long a[], long n) {
        ArrayList<Long> negativeNumbers = new ArrayList<Long>();
        ArrayList<Long> positiveNumbers = new ArrayList<Long>();
        for(int i=0;i<(int)n;i++){
            if(a[i] < 0){
                negativeNumbers.add(a[i]);
            } else {
                positiveNumbers.add(a[i]);
            }
        }
        negativeNumbers.addAll(positiveNumbers);
        for(int i=0;i<n;i++){
            a[i] = negativeNumbers.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long arr [] = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer[] = rearrange(arr, n);
        System.out.println("Rearranged Array");
        for(long i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

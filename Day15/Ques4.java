package Day15;

// Sum of distinct elements for a limited range
import java.util.*;

public class Ques4 {
    public static long sumOfDistinct(long arr[], int N) {
        HashSet<Long> distinctElements = new HashSet<Long>();
        for(int i=0;i<N;i++){
            distinctElements.add(arr[i]);
        }
        long sum = 0;
        Iterator<Long> iterator = distinctElements.iterator();
        while(iterator.hasNext()){
            sum += iterator.next();
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long sumOfDistinct = sumOfDistinct(arr, n);
        System.out.println("Sum of all distinct elements is: " + sumOfDistinct);
        scan.close();
    }
}

package Day11;

// Sort in specific order
import java.util.*;

public class Ques9 {
    public static long[] sortIt(long arr[], long n) {
        ArrayList<Long> oddNumbers = new ArrayList<Long>();
        ArrayList<Long> evenNumbers = new ArrayList<Long>();
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenNumbers.add(arr[i]);
            } else {
                oddNumbers.add(arr[i]);
            }
        }
        Collections.sort(oddNumbers, Collections.reverseOrder());
        Collections.sort(evenNumbers);
        oddNumbers.addAll(evenNumbers);
        for(int i=0;i<n;i++){
            arr[i] = oddNumbers.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long ans [] = sortIt(arr, n);
        System.out.println("Sorted Array");
        for(long i: ans){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

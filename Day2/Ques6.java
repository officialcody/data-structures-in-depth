package Day2;

// At least two greater elements
import java.util.*;

public class Ques6 {
    public static long[] findElements( long a[], long n)
    {
        Arrays.sort(a);
        long [] answer = new long[(int)n-2];
        for(int i=0;i<n-2;i++){
            answer[i] = a[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long [] answer = findElements(arr, n);
        System.out.println("After removing two largest elements from the array: ");
        for(long number : answer){
            System.out.print(number + " ");
        }
        scan.close();
    }
}

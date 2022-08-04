package Day19;

// Check Fibonacci in the array
import java.util.*;

public class Ques2 {
    public static int checkFib(long arr[] ,int N) {
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();

        long max= Long.MIN_VALUE;
        int count = 0;

        for(long x : arr){
            map.put(x, map.getOrDefault(x, 0) + 1);
            max = ( x > max ) ? x : max;
        }

        if(map.containsKey(0L)){
            count += map.get(0L);
        }
        if(map.containsKey(1L)){
            count += map.get(1L);
        }
        
        long fn = 1;
        long sn = 1;
        long num = 1;

        while(num < max){
            num = fn + sn;
            if(map.containsKey(num)){
                count+=map.get(num);
            }
            fn = sn;
            sn = num;
        }
        
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int answer = checkFib(arr, n);
        System.out.println("Number of elements in the array which are of fibonacci series are: " + answer);
        scan.close();
    }
}

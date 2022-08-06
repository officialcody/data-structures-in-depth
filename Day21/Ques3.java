package Day21;

// Absolute Difference of 1
import java.util.*;

public class Ques3 {

    public static long[] getDigitDiff1AndLessK(long[] arr, int n, long k) {
        ArrayList<Long> answer = new ArrayList<Long>();
        for(long num : arr){
            if(num < k && isDifferenceOne(num)){
                answer.add(num);
            }
        }
        long [] ar = new long[answer.size()];
        int pos = 0;
        for(long val : answer){
            ar[pos] = val;
            pos++;
        }
        return ar;
    }
    
    public static boolean isDifferenceOne(long num){
        if(num/10==0){
            return false;
        }
        long fn = num%10;
        num = num/10;
        long sn = num%10;
        while(num > 0){
            if(Math.abs(fn-sn) != 1){
                return false;
            }
            fn = sn;
            num = num/10;
            sn = num%10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        int k = scan.nextInt();
        long [] answer = getDigitDiff1AndLessK(arr, n, k);
        System.out.println("Numbers which are less than " + k + " and has 1 as difference between adjacent digits are:");
        for(long num : answer){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

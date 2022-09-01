package GFG;

// Sum Triangle for given array
import java.util.*;

public class Ques34 {
    public static long[] getTriangle(long arr[], long n) {
        ArrayList<Long> reversedList = new ArrayList<Long>();
        for(int i=(int)n-1;i>=0;i--){
            reversedList.add(arr[i]);
        }
        long pos = n-1;
        while(pos > 0) {
            for(int i=0;i<pos;i++){
                arr[i] = arr[i] + arr[i+1];
            }
            for(int i=(int)pos-1;i>=0;i--){
                reversedList.add(arr[i]);
            }
            pos--;
        }
        long [] answer = new long[reversedList.size()];
        int curr = 0;
        for(int i=reversedList.size()-1;i>=0;i--){
            answer[curr] = reversedList.get(i);
            curr++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long answer [] = getTriangle(arr, n);
        for(long number : answer){
            System.out.print(number + " ");
        }
        scan.close();
    }
}

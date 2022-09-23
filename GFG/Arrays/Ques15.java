package GFG.Arrays;

// Tracks
import java.util.*;

public class Ques15 {
    public static String tracks(long arr[], long n) {
        String answer = "";
        if(n%2==0) return "No";
        if(arr[(int)n/2] != 1){
            answer = "No";
        } else {
            long start = 0;
            long end = n - 1;
            boolean match = true;
            while(start < end){
                if(arr[(int)start] != arr[(int)end]){
                    answer = "No";
                    match = false;
                    break;
                }
                start++;
                end--;
            }
            if(match){
                long diff = Math.abs(arr[0] - arr[1]);
                boolean sameDifference = true;
                for(int i=1;i<n-1;i++){
                    long difference = Math.abs(arr[i] - arr[i+1]);
                    if(difference != diff || diff < 1){
                        answer = "No";
                        sameDifference = false;
                        break;
                    }
                }
                if(sameDifference){
                    answer = "Yes";
                }
            }
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
        String isValidTrack = tracks(arr, n);
        System.out.println("It is a valid track: " + isValidTrack);
        scan.close();
    }
}

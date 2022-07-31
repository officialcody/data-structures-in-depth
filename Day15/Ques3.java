package Day15;

// Difference between highest and lowest occurrence
import java.util.*;

public class Ques3 {
    public static long findDiff(long arr[], long n) {
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        long lowestOccurence = Long.MAX_VALUE;
        long highestOccurence = Long.MIN_VALUE;
        
        for(long value : map.values()){
            if(value < lowestOccurence){
                lowestOccurence = value;
            }
            if(value > highestOccurence){
                highestOccurence = value;
            }
        }
        
        return highestOccurence - lowestOccurence;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }

        long diffLowHighOccurence = findDiff(arr, n);
        System.out.println("Difference between highest occurence and lowest occurence is: " + diffLowHighOccurence);
        scan.close();
    }
}

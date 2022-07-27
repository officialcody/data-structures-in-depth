package Day11;
// Maximum Repeating Number
import java.util.*;

public class Ques7 {
    public static int maxRepeating(int[] arr, int n, int k) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();

        int maxFreq = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        // find frequency of each number
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                // find maximum frequency
                // if(map.get(arr[i]) > maxFreq){
                //     maxFreq = map.get(arr[i]);
                // }
            } else {
                map.put(arr[i], 1);
            }
        }
        
        // find maximum frequency
        for(int i: map.values()){
            if(i > maxFreq){
                maxFreq = i;
            }
        }
        
        // add all numbers with max frequency in an arraylist
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if((int)entry.getValue() == maxFreq){
                answer.add((int)entry.getKey());
            }
        }
        
        // find minimum value with maximum frequency
        for(int i=0;i<answer.size();i++){
            if(answer.get(i) < minValue){
                minValue = answer.get(i);
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int maxRepeating = maxRepeating(arr, n, k);
        System.out.println("Maximum repeating number is: " + maxRepeating);
        scan.close();
    }
}

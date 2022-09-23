package GFG.Arrays;

// Distinct Adjacent Element
import java.util.*;

public class Ques31 {
    public static boolean distinctAdjacentElement(int arr[] , int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        for(int num : arr){
            int freq = map.get(num);
            if(freq > maxFreq){
                maxFreq = freq;
            }
        }
        return maxFreq <= (n+1)/2 ? true : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        if(distinctAdjacentElement(arr, n)){
            System.out.println("It can be swapped");
        } else {
            System.out.println("It cannot be swapped");
        }
        scan.close();
    }
}

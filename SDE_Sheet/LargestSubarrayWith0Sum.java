package SDE_Sheet;

import java.util.*;

public class LargestSubarrayWith0Sum {
    public static int maxLen(int arr[], int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int Maxcount =0;
        map.put(0,-1);
        for(int i=0;i<arr.length;i++){
             sum = sum + arr[i];
            if(map.containsKey(sum)){
                if(Maxcount< i-map.get(sum)) {
                    Maxcount = i-map.get(sum);
                }
            } else { 
                map.put(sum,i);
            }
        }
        return Maxcount;
    }
}

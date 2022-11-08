package GFG.POTD;

import java.util.*;

// https://practice.geeksforgeeks.org/problems/two-numbers-with-odd-occurrences5846/1

public class POTD1 {
    public int[] twoOddNum(int Arr[], int N) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0;i<N;i++) {
            map.put(Arr[i], map.getOrDefault(Arr[i], 0)+1);
        }
        int [] answer = new int[2];
        int pos = 1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()%2!=0 && pos >= 0) {
                answer[pos] = entry.getKey();
                pos--;
            }
        }
        return answer;
    }
}

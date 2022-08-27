package GFG;

import java.util.*;

public class Ques16 {
    public static int[] uniqueId(long arr[], long n) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        for(long num : arr){
            hs.add((int)num);
        }
        int [] answer = new int[hs.size()];
        int pos = 0;
        Iterator<Integer> iter = hs.iterator();
        while(iter.hasNext()){
            answer[pos] = iter.next();
            pos++;
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
        int [] answer = uniqueId(arr, n);
        System.out.println("After removing duplicate id's");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

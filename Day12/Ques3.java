package Day12;

// Professor and Parties

import java.util.*;

public class Ques3 {
    public static String PartyType( long a[], int n) {
        HashMap<Long, Integer> hm = new HashMap<Long, Integer>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            } else {
                hm.put(a[i], 1);
            }
        }
        for(int i : hm.values()){
            if(i > 1){
                return "BOYS";
            }
        }
        
        return "GIRLS";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        String answer = PartyType(arr, n);
        System.out.println("It is a " + answer + "'s Party");
        scan.close();
    }
}

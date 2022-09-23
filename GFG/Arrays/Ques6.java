package GFG.Arrays;

// Array Subset of another array
import java.util.*;

public class Ques6 {
    /***
     * USING Sorting 
     * @param a1
     * @param a2
     * @param n
     * @param m
     * @return
     */
    public static String isSubset3( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        int i = 0;
        int j = 0;
        while(i<n && j <m){
            if(a1[i] == a2[j]){
                j++;
            }
            i++;
        }
        if(j >= m){
            return "Yes";
        }
        return "No";
    }
    
    /***
     * USING ARRAYLIST
     * @param a1
     * @param a2
     * @param n
     * @param m
     * @return
     */
    public static String isSubset2( long a1[], long a2[], long n, long m) {
        ArrayList<Long> a=new ArrayList<>();
       for(int i=0; i<a1.length; i++) {
           a.add(a1[i]);
       }
       for(int i=0; i<a2.length; i++) {
           if(a.contains(a2[i])) {
                a.remove(Long.valueOf(a2[i]));
           }
           else {
               return "No";
           }
       }
       return "Yes";
    }

    /***
     *  USING HASHMAP
     * @param a1
     * @param a2
     * @param n
     * @param m
     * @return
     */
    public static String isSubset(long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a1[i])){
                map.put(a1[i], map.get(a1[i])+1);
            } else {
                map.put(a1[i], 1);
            }
        }
        boolean isSubset = true;
        for(int i=0;i<m;i++){
            if(!map.containsKey(a2[i])){
                isSubset = false;
                break;
            } else {
                if(map.get(a2[i]) >= 1){
                    map.put(a2[i], map.get(a2[i])-1);
                } else{
                    isSubset = false;
                    break;
                }
            }
        }
        if(isSubset){
            return "Yes";
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long [] arr = new long[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        long m = scan.nextLong();
        long [] brr = new long[100000];
        for(int i=0;i<m;i++){
            brr[i] = scan.nextLong();
        }
        String isSubset = isSubset(arr, brr, n, m);
        if(isSubset.equals("Yes")){
            System.out.println("It is a subset");
        } else {
            System.out.println("Its not a subset");
        }
        scan.close();
    }
}

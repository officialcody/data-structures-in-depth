package Day7;

// First element present k times in an array

import java.util.*;

public class Ques4 {
    public static int getMax(int [] a, int n){
        int max = Integer.MIN_VALUE;
        for(int number : a){
            if(number > max){
                max = number;
            }
        }
        return max;
    }
    /**
     * Time Complexity = O(N)
     * Space Complexity = O(N)
     * @param a
     * @param n
     * @param k
     * @return
     */
    public static int firstElementKTime(int[] a, int n, int k) { 
        int max = getMax(a,n);
        int [] occurences = new int[max+1];
        
        for(int i=0;i<n;i++){
            occurences[a[i]]++;
            if(occurences[a[i]] == k){
                return a[i];
            }
        }
        return -1;
    } 

    public static int firstElementKTimeHashMap(int[] a, int n, int k) { 
        if(k==1) return a[0];
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(a[i])){
                count = hm.get(a[i]);
                hm.put(a[i], count+1);
                if(hm.get(a[i]) == k){
                    return a[i];
                }
            } else {
                hm.put(a[i], 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int firstElementKTime = firstElementKTime(arr, n, k);
        if(firstElementKTime != -1){
            System.out.println("First element that is repeated " + k  + " times is: " + firstElementKTime);
        } else {
            System.out.println("No element is repeating" + k + " times");
        }
        scan.close();
    }
}

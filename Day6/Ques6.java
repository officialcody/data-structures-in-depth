package Day6;

// Number of occurences in a sorted array
import java.util.*;

public class Ques6 {
    /** Brute Force approach
     * Time Complexity = O(n)
     * @param arr
     * @param n
     * @param target
     * @return count
     */
    public static int countBruteForce(int[] arr, int n, int target) {
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == target){
                count++;
            }
        }
        return count;
    }

    /** Solution using HashMap
     * Time Complexity = O(n)
     * @param arr
     * @param n
     * @param target
     * @return count
     */
    public static int countHashMap(int[] arr, int n, int x) {
        int ans=0;
        Map<Integer,Integer> mp=new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++) {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()) {
            if(entry.getKey()==x) {
                ans=entry.getValue();
            }
        }
        return ans;
    }

    /*** Solution using binary search
     * Time Complexity = O(n)
     * Find the position/index of first occurence of target and then loop till target
     * is equal to array elements after that position
     * @param arr
     * @param n
     * @param target
     * @return count
     */
    public static int countBinarySearch(int [] arr, int n, int target) {
        int low=0;
        int high=n-1,count=0;
        int pos=0;
        while(low<=high) {
            int mid=(low+high)/2;
            if(target < arr[mid]) {
                high=mid-1;
            }
            else if(target > arr[mid]) {
                low=mid+1;
            }
            else {
                pos=mid;
                high=mid-1;
            }
        }
        while(pos < n) {
            if(arr[pos] == target){
                count++;
            }
            pos++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();

        int answerBruteForce = countBruteForce(arr, n, target);
        System.out.println("====Brute force approach====");
        System.out.println("Number of occurences: " + answerBruteForce);

        int answerBinarySearch = countBinarySearch(arr, n, target);
        System.out.println("====Using Binary Search====");
        System.out.println("Number of occurences: " + answerBinarySearch);

        int answerHashMap = countHashMap(arr, n, target);
        System.out.println("====Using HashMap====");
        System.out.println("Number of occurences: " + answerHashMap);

        scan.close();
    }
}

package Day11;

// Adding Array Elements
import java.util.*;

/***
 * Ques - Given an array Arr[] of size N and an integer K, you have to add the first two 
 * minimum elements of the array until all the elements are greater than or equal to K and 
 * find the number of such operations required.
 * 
 * Input:
 *  N = 6, K = 6 
 *  Arr[] = {1, 10, 12, 9, 2, 3}
 * Output: 2
 *      
 * Explanation: First we add (1 + 2), now the new list becomes 3 10 12 9 3, then we add
 * (3 + 3), now the new list becomes 6 10 12 9, Now all the elements in the list are greater
 * than 6. Hence the output is 2 i:e 2 operations are required to do this. 
 * 
 */
public class Ques8 {
    public static int minOperations(int[] arr, int n, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for(int i:arr)p.add(i);
        int c=0;
        while(p.peek()<k && p.size()>1){
            int a=p.poll();
            int b=p.poll();
            p.add(a+b);
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int minOperations = minOperations(arr, n, k);
        System.out.println("Minimum operations: " + minOperations);
        scan.close();
    }
}

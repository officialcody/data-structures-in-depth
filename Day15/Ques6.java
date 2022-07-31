package Day15;

// Find duplicates under given constraints

/***
 * QUES - Given a sorted array A[] having 10 elements which contain 6 different numbers in which
 * only 1 number is repeated five times. Your task is to find the duplicate number using two 
 * comparisons only.
 * 
 * Example - 
 *  Input: 
 *      A[] = {1, 1, 1, 1, 1, 5, 7, 10, 20, 30}
 *  Output: 
 *      1
 */
import java.util.*;

public class Ques6 {
    public static int findDuplicate(int A[]) {
        if(A[5]==A[6]){
            return A[5];
        } else {
            return A[4];
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int duplicateNumber = findDuplicate(arr);
        System.out.println("Duplicate value is: " + duplicateNumber);
        scan.close();
    }
}

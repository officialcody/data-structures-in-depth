package GFG.Arrays;

// Key Pair
import java.util.*;

public class Ques51 {
    public static boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> hs = new HashSet<Integer>();
         for(int i=0;i<n;i++){
             if(hs.contains(x-arr[i])){
                 return true;
             }
             hs.add(arr[i]);
         }
         return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        if(hasArrayTwoCandidates(arr, n, x)) {
            System.out.println("Has numbers");
        } else {
            System.out.println("Does not have numbers");
        }
        scan.close();
    }
}

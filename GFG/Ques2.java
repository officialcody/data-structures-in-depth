package GFG;

// Absolute distinct count
import java.util.*;

public class Ques2 {
    public static int distinctCount(int[] arr, int n) {
        HashSet<Integer> distinctElements = new HashSet<Integer>();
        for(int i : arr){
            int absValue = Math.abs(i);
            if(!distinctElements.contains(absValue)){
                distinctElements.add(absValue);
            }
        }
        return distinctElements.size();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = distinctCount(arr, n);
        System.out.println("Number of distinct absolute elements is: " + answer);
        scan.close();
    }
}

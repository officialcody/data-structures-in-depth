package GFG;

// Sort first half in ascending and second half in descending
import java.util.*;

public class Ques21 {
    public static int[] customSort(int[] arr, int n) {
        int mid = n/2;
        int[] first = new int[mid];
        int[] second = new int[n - mid];
        
        for(int i = 0; i<mid; i++){
            first[i] = arr[i];
        }
        for(int i=mid; i<n; i++){
            second[i-mid] = arr[i]; 
        }
        Arrays.sort(first);
        Arrays.sort(second);
        
        for(int i = 0; i<mid; i++){
            arr[i] = first[i];
        }
        int pos = second.length - 1;
        for(int i=mid; i<n; i++){
            arr[i] = second[pos];
            pos--;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = customSort(arr, n);
        System.out.println("After sorting");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

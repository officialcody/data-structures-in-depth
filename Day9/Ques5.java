package Day9;

// Triplet Family
import java.util.*;

public class Ques5 {
    public static ArrayList<Integer> findTriplet(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Arrays.sort(arr);
        int start;
        int end;
       
        for(int i=0; i<n; i++) {
           start = 0;
           end = n-1;
           while(start<end) {
               if(arr[start] + arr[end] == arr[i]) {
                   result.add(arr[start]);
                   result.add(arr[end]);
                   result.add(arr[i]);
                   return result;
                } else if(arr[start] + arr[end] < arr[i]) {
                   start++;
                } else {
                   end--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> result = findTriplet(arr, n);
        for(int i : result){
            System.out.println(i + " ");
        }
        scan.close();
    }
}

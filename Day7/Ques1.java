package Day7;
// Search first index of a number in an array
import java.util.*;

public class Ques1 {
    public static int search(int arr[], int n, int k) {
        for(int i =0;i<n;i++){
            if(arr[i] == k){
                return i+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int firstIndex = search(arr, n, k);
        if(firstIndex != -1){
            System.out.println("First occurence of " + k + " in array is: " + firstIndex);
        } else {
            System.out.println("Number not found in the array");
        }
        scan.close();
    }
}

package Day14;

// Inverse Permutation
import java.util.*;

public class Ques2 {
    public static ArrayList<Integer> inversePermutation (int arr[], int n) {
        int [] a = new int[n];
        for(int i=0;i<n;i++){
            a[arr[i]-1] = i+1;
        }
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i : a){
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> answer = inversePermutation(arr, n);
        System.out.println("Inversed List");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

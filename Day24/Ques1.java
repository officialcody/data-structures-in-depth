package Day24;

// Last duplicate element in a sorted array
import java.util.*;

public class Ques1 {
    public static ArrayList<Integer> dupLastIndex (int arr[], int n) {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=n-1;i>=1;i--){
             if(arr[i]==arr[i-1]){
                al.add(i);
                al.add(arr[i]);
                return al;
             }
         }
         al.add(-1);  
         return al;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> answer = dupLastIndex(arr, n);
        answer.forEach((e) -> System.out.print(e + " "));
        scan.close();
    }
}

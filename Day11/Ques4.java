package Day11;

// Elements in the Range
import java.util.*;

public class Ques4 {
    public static boolean checkElements(int arr[], int n, int A, int B) {
        HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();
        for(int i : arr){
            elements.put(i, 0);
        }
        
        for(int i=A;i<=B;i++){
            if(!elements.containsKey(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int A = scan.nextInt();
        int B = scan.nextInt();
        boolean answer = checkElements(arr, n, A, B);
        if(answer){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        scan.close();
    }
}

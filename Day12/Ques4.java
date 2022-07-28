package Day12;

// Rearrange Array
import java.util.*;

public class Ques4 {
    public static int[] rearrangeArray(int[] arr, int n) {
        Arrays.sort(arr);
        int temp[] = new int[n];
        for(int i = 0; i < n; i++){
            temp[i] = arr[i];
        }
        
        int start = 0, end = n-1;
        for(int i = 0; i < n; i++){
            if(i%2==0){
                arr[i] = temp[start];
                start++;
            }
            else{
                arr[i] = temp[end];
                end--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer[] = rearrangeArray(arr, n);
        System.out.println("Rearranged Array");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

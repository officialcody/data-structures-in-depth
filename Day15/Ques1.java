package Day15;

// Rearranging Array
import java.util.*;

public class Ques1 {
    public static int[] rearrange(int a[], int n) {
        int answer [] = new int[n];
        Arrays.sort(a);
        int start = 0;
        int end = n - 1;
        int pos = 0;
        while(start <= end){
            if(pos%2==0){
                answer[pos] = a[start];
                start++;
            } else {
                answer[pos] = a[end];
                end--;
            }
            pos++;
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
        int rearrangedArray [] = rearrange(arr, n);
        System.out.println("Rearranged Array");
        for(int i : rearrangedArray){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

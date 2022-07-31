package Day15;

// Merge and Sort
import java.util.*;

public class Ques11 {
    public static int[] mergeNsort(int a[], int b[], int n, int m){
        Set<Integer> ts1 = new TreeSet<Integer>();
        for(int i=0;i<n;i++){
           ts1.add(a[i]);
        }
        for(int i=0;i<m;i++){
           ts1.add(b[i]);
        }
        int answer [] =new int[ts1.size()];
        int j=0;
        for(int i:ts1){
           answer[j]=i;
           j++;
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
        int m = scan.nextInt();
        int [] brr = new int[10000000];
        for(int i=0;i<m;i++){
            brr[i] = scan.nextInt();
        }
        int answer [] = mergeNsort(arr, brr, n, m);
        System.out.println("After merging and sorting");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

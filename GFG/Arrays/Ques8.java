package GFG.Arrays;

// Sort an array of 0s, 1s and 2s
import java.util.*;

public class Ques8 {
    public static int[] sort012(int a[], int n) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i : a){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        int pos = 0;
        for(int i = 0;i<map.get(0);i++){
            a[pos]=0;
            pos++;
        }
        for(int i=0;i<map.get(1);i++){
            a[pos] = 1;
            pos++;
        }
        for(int i=0;i<map.get(2);i++){
            a[pos] = 2;
            pos++;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer [] = sort012(arr, n);
        System.out.println("After sorting");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

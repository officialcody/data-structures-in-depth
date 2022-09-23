package GFG.Arrays;

// Even occurring elements
import java.util.*;

public class Ques7 {
    public static int[] repeatingEven(int[] arr, int n) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int size = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0){
                size++;
            }
        }
        int answer[] = new int[size];
        int start = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()%2==0){
                answer[start] = entry.getKey();
                start++;
            }
        }
        return start > 0 ? answer : new int[]{-1};
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = repeatingEven(arr, n);
        if(answer.length == 1 && answer[0] == -1){
            System.out.println("There are no repeating elements");
        } else {
            for(int num : answer){
                System.out.print(num + " ");
            }
        }
        scan.close();
    }
}

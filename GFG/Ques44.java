package GFG;

// First Repeating Element
import java.util.*;

public class Ques44 {
    public static int firstRepeated(int[] arr, int n) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i]) && map.get(arr[i]) > 1){
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
        int position = firstRepeated(arr, n);
        if(position == -1){
            System.out.println("No repeating element");
        } else {
            System.out.println("First repeating element is on position: " + position);
        }
        scan.close();
    }
}

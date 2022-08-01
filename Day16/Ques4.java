package Day16;

// First Come First Serve
import java.util.*;

public class Ques4 {
    public static int firstElement(int arr[], int n, int k) { 
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        // for(int i : arr){
        //     map.put(i, map.getOrDefault(i, 0)+1);
        // }
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == k){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[1000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int firstElement = firstElement(arr, n, k);
        if(firstElement == -1){
            System.out.println("There is no such element");
        } else {
            System.out.println("The first element is: " + firstElement);
        }
        scan.close();
    }
}

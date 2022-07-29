package Day13;

// Find Unique element
import java.util.*;

public class Ques4 {
    public static int findUnique(int a[], int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int answer = a[0];
        for(int i=0;i<n;i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i])+1);
            } else {
                hm.put(a[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: hm.entrySet()){
            if(entry.getValue()%k!=0){
                answer = entry.getKey();
            }
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
        int k = scan.nextInt();
        int uniqueElement = findUnique(arr, n, k);
        System.out.println("Unique Element in array is: " + uniqueElement);
        scan.close();
    }
}

package Day13;

// Smallest number repeating K times
import java.util.*;

public class Ques5 {
    public static int findDuplicate(int arr[], int N,int K) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = -1;
        for(int i=0;i<N;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == K){
                ans.add(entry.getKey());
            }
        }
        Collections.sort(ans);
        answer = ans.get(0);
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

        int duplicate = findDuplicate(arr, n, k);
        System.out.println("Smallest Duplicate element is" + duplicate);
        scan.close();
    }
}

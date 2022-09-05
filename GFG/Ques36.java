package GFG;

// Find duplicates in an array
import java.util.*;

public class Ques36 {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        TreeMap<Integer, Integer> map =new TreeMap<Integer, Integer>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                answer.add(entry.getKey());
            }
        }
        ArrayList<Integer> notFound = new ArrayList<Integer>();
        notFound.add(-1);
        return answer.size() >= 1 ? answer : notFound;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> answer = duplicates(arr, n);
        if(answer.size() == 1 && answer.get(0)==-1){
            System.out.println("No duplicates found");
        } else {
            for(int ans : answer){
                System.out.print(ans + " ");
            }
        }
        scan.close();
    }
}

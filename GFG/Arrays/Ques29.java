package GFG.Arrays;

// Average Count Array
import java.util.*;

public class Ques29 {
    public static ArrayList<Integer> countArray (int arr[], int n, int x) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int average = (arr[i] + x)/2;
            if(map.containsKey(average)){
                answer.add(map.get(average));
            } else {
                answer.add(0);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        ArrayList<Integer> answer = countArray(arr, n, x);
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

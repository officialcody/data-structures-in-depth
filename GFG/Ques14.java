package GFG;

// Distinct Elements in a Stream
import java.util.*;

public class Ques14 {
    public static ArrayList<Integer> maxDistinctNum(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int number : arr){
            if(number >= 0) {
                map.put(number, map.getOrDefault(number, 0) + 1);
            } else if(map.containsKey(Math.abs(number))){
                if(map.get(Math.abs(number)) == 1){
                    map.remove(Math.abs(number));
                } else {
                    map.put(Math.abs(number), map.get(Math.abs(number)) - 1);
                }
            }
            answer.add(map.size());
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
        ArrayList<Integer> distinctElementsInAStream = maxDistinctNum(arr, n);
        System.out.println("Distinct elements in a stream");
        for(int i : distinctElementsInAStream){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

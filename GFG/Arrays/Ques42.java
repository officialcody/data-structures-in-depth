package GFG.Arrays;

// Subarray with given sum
import java.util.*;

public class Ques42 {
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        if(s == 0) {
            answer.add(-1);
            return answer;
        }
        int sum = 0;
        int start = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            while(sum > s){
                sum = sum - arr[start];
                start++;
            }
            if(sum == s){
                answer.add(start + 1);
                answer.add(i+1);
                return answer;
            }
        }
        answer.add(-1);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int s = scan.nextInt();
        ArrayList<Integer> answer = subarraySum(arr, n, s);
        if(answer.size() == 1 && answer.get(0) == -1){
            System.out.println("No subarray has the sum");
        } else {
            System.out.println("Sum is from index " + answer.get(0) + " to " + answer.get(1));
        }
        scan.close();
    }
}

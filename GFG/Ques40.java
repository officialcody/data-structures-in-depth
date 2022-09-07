package GFG;

// Leaders in an array
import java.util.*;

public class Ques40 {
    public static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int max = arr[n-1];
        for(int i=n-1;i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                tempList.add(arr[i]);
            }
        }
        for(int i=tempList.size() - 1;i>=0;i--){
            answer.add(tempList.get(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> answer = leaders(arr, n);
        System.out.println("Leaders in array: ");
        for(int num : answer){
            System.out.print(num + " ");
        }
        scan.close();
    }
}

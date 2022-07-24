package Day8;

// First and Last Occurence of a number in an array
import java.util.*;

public class Ques10 {
    public static ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        int first = -1;
        int last = -1;
        
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                first = i;
                break;
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                last = i;
            }
        }
        
        if(first != -1 && last != -1){
            answer.add(first);
            answer.add(last);
        } else {
            answer.add(-1);
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
        int x = scan.nextInt();
        ArrayList<Integer> answer = firstAndLast(arr, n, x);
        if(answer.size() == 1){
            System.out.println("Number doesnot exist in the array");
        } else {
            System.out.println("First occurence => " + answer.get(0));
            System.out.println("First occurence => " + answer.get(1));
        }
        scan.close();
    }
}

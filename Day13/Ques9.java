package Day13;

// Sum of distinct elements
import java.util.*;

public class Ques9 {
    public static int findSum(int arr[], int n) {
        HashSet<Integer> distinctElements = new HashSet<Integer>();
        int answer = 0;
        for(int i=0;i<n;i++){
            distinctElements.add(arr[i]);
        }
        
        Iterator<Integer> iterator = distinctElements.iterator();
        while(iterator.hasNext()){
            answer += iterator.next();
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
        int distinctSum = findSum(arr, n);
        System.out.println("Sum of distinct elements is:" + distinctSum);
        scan.close();
    }
}

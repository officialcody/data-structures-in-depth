package Day15;

// Remove Duplicates from unsorted array
import java.util.*;

public class Ques5 {
    public static int[] removeDuplicate(int A[], int N) {
        LinkedHashSet<Integer> distinctElements = new LinkedHashSet<Integer>();
        for(int i=0;i<N;i++){
            distinctElements.add(A[i]);
        }
        Iterator<Integer> iter = distinctElements.iterator();
        int pos=0;
        int answer [] = new int[distinctElements.size()];
        while(iter.hasNext()){
            answer[pos] = iter.next();
            pos++;
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
        int [] answer = removeDuplicate(arr, n);
        System.out.println("After removing duplicates");
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

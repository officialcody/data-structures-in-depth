package Day11;

// Alternate Sorting
import java.util.*;

public class Ques10 {
    public static ArrayList<Long> alternateSort(long arr[] ,int N) {
        Arrays.sort(arr);
        ArrayList<Long> answer = new ArrayList<Long>();
        int i = 0;
        int j = N - 1;
        int pos = 0;
        while(i <= j){
            if(pos%2==0){
                answer.add(arr[j]);
                j--;
            } else {
                answer.add(arr[i]);
                i++;
            }
            pos++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long [] arr = new long[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextLong();
        }
        ArrayList<Long> answer = alternateSort(arr, n);
        System.out.println("After Sorting");
        for(long number : answer){
            System.out.print(number + " ");
        }
        scan.close();
    }
}

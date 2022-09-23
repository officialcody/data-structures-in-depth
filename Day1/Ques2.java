

import java.util.*;

// Value equal to index value

public class Ques2 {
    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i] == (i+1)){
                answer.add(arr[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        ArrayList<Integer> al = valueEqualToIndex(arr, n);
        al.forEach(element -> System.out.print(element + " "));
        scan.close();
    }
}

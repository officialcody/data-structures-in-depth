package Day25;

import java.util.*;

public class Ques1 {
    public static int toughCompetitor(int[] arr, int n) {
        Arrays.sort(arr);
        int min = arr[1] - arr[0];
        for(int i=1;i<n-1;i++){
            int temp = arr[i+1] - arr[i];
            if(min > temp){
                min = temp;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int answer = toughCompetitor(arr, n);
        System.out.println("Min value with abs difference is " + answer);
        scan.close();
    }
}

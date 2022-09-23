package GFG.Arrays;

import java.util.*;

public class Ques4 {
    public static String Country_at_war (int arr[], int brr[], int n) {
        int sumA = 0;
        int sumB = 0;
        for(int i=0;i<n;i++){
            if(arr[i] > brr[i]){
                sumA++;
            } else if(brr[i] > arr[i]){
                sumB++;
            }
        }
        String answer = "";
        if(sumA == sumB) {
            answer = "DRAW";
        } else if(sumA > sumB){
            answer = "A";
        } else {
            answer = "B";
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
        int [] brr = new int[100000];
        for(int i=0;i<n;i++){
            brr[i] = scan.nextInt();
        }
        String winnner = Country_at_war(arr, brr, n);
        if(winnner.equals("DRAW")){
            System.out.println("Its a draw");
        } else {
            System.out.println("Winner is country: " + winnner);
        }
        scan.close();
    }
}

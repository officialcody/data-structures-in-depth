package Day8;

import java.util.*;

public class QUes7 {
    public static int numberOfNumbers(int a[], int n, int k) {
        int count = 0;
        for(int i=0;i<n;i++){
            int number = a[i];
            while(number > 0){
                int lastDigit = number%10;
                if(lastDigit == k){
                    count++;
                }
                number/=10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a [] = new int[100000];
        for(int i=0;i<n;i++){
            a[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        int numberOfNumbers = numberOfNumbers(a, n, k);
        System.out.println("Number of " + k + "'s in array are: " + numberOfNumbers);
        scan.close();
    }
}

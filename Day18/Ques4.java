package Day18;

import java.util.Scanner;

// Average
public class Ques4 {
    public static long calculateAverage(long arr[], int number){
        long sum = 0;
        for(int i=0;i<number;i++){
            sum += arr[i];
        }
        return sum/number;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        long [] arr = new long[100000];
        for(int i=0;i<number;i++){
            arr[i] = scan.nextLong();
        }
        long average = calculateAverage(arr, number);
        System.out.println("Average is: " + average);
        scan.close();
    }
}

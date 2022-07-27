package Day11;

// Segregate Even and Odd numbers
import java.util.*;

public class Ques3 {
    public static int[] segregateEvenOdd(int arr[], int n) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]%2 == 0){
                evenNumbers.add(arr[i]);
            } else {
                oddNumbers.add(arr[i]);
            }
        }
        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers);
        evenNumbers.addAll(oddNumbers);
        for(int i=0;i<n;i++){
            arr[i] = evenNumbers.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int [] answer = segregateEvenOdd(arr, n);
        for(int i : answer){
            System.out.print(i + " ");
        }
        scan.close();
    }
}

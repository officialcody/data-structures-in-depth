package Day4;

import java.util.Scanner;

public class Ques5 {
    public static int search(int arr[], int N, int X)
    {
        int element = -1;
        for(int i=0;i<N;i++){
            if(arr[i] == X){
                element = i;
                break;
            }
        }
        return element;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int X = scan.nextInt();
        int firstOccurence = search(arr, n, X);
        if(firstOccurence == -1){
            System.out.println("Element doesnot exists");
        } else {
            System.out.println("First occurence of element is at index: " + firstOccurence);
        }
        scan.close();
    }
}

package ApnaCollegePracticeQuestions.Recursion;

public class PrintOccurencesOfTargetInArray {
    public static void printOccurences(int n, int [] arr, int key) {
        if(n == arr.length) {
            return;
        }
        if(arr[n] == key) {
            System.out.print(n + " ");
        }
        printOccurences(n+1, arr, key);
    }

    public static void main(String[] args) {
        int arr [] = new int[]{3,2,4,5,6,2,7,2,2};
        int key = 2;
        printOccurences(0, arr, key);
    }
}

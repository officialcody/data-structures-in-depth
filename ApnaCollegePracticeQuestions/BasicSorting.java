package ApnaCollegePracticeQuestions;

import java.util.Arrays;
import java.util.Collections;

public class BasicSorting {
    public static void bubbleSort(int [] arr, int n) {
        for(int i=0;i<n-1;i++){
            int swap = 0;
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
            if(swap == 0) {
                break;
            }
        }
        System.out.println("After sorting with bubble sort");
        printArray(arr, n);
    }

    public static void selectionSort(int [] arr, int n) {
        for(int i=0;i<n;i++){
            int minimumPosition = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minimumPosition]){
                    minimumPosition = j;
                }
            }
            // swap
            int temp = arr[minimumPosition];
            arr[minimumPosition] = arr[i];
            arr[i] = temp;
        }
        System.out.println("After sorting with selection sort");
        printArray(arr, n);
    }

    public static void insertionSort(int [] arr, int n) {
        for(int i=1;i<n;i++){
            int currentIndex = i;
            int previousIndex = i - 1;
            // find the correct position to insert the element
            while(previousIndex >= 0 && arr[previousIndex] > arr[currentIndex]) {
                arr[previousIndex+1] = arr[previousIndex];
                previousIndex--;
            }
            // insertion
            arr[previousIndex + 1] = arr[currentIndex];
        }
        System.out.println("After sorting with insertion sort");
        printArray(arr, n);
    }

    public static void countingSort(int [] arr, int n) {
        // find largest number
        int largest = Integer.MIN_VALUE;
        for(int num : arr) {
            largest = Math.max(largest, num);
        }

        // calculate frequency of each element in array
        int count[] = new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        // sorting
        int pos = 0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[pos] = i;
                pos++;
                count[i]--;
            }
        }

        System.out.println("After sorting using counting sort");
        printArray(arr, n);
    }
 
    public static void printArray(int [] arr, int n) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(Integer [] arr, int n) {
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int arr [] = new int []{5,4,1,3,2};
        bubbleSort(arr, n);
        selectionSort(arr, n);
        insertionSort(arr, n);

        // Sort using Inbuilt sort
        Arrays.sort(arr);
        printArray(arr, n);

        // Sort from starting index to ending index where ending index is exclusive
        Arrays.sort(arr, 0, 3);
        printArray(arr, n);

        Integer newArray[] = {5,4,1,3,2};

        // Sort array in reverse order
        Arrays.sort(newArray, Collections.reverseOrder());
        printArray(newArray, n);

        // Sort array in reverse order with provided stating and ending indices where ending index is exclusive
        Arrays.sort(newArray, 0, 3, Collections.reverseOrder());
        printArray(newArray, n);

        // counting sort
        int array [] = new int[]{1,4,1,3,2,4,3,7};
        countingSort(array, array.length);
    }
}

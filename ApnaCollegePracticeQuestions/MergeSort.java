package ApnaCollegePracticeQuestions;

public class MergeSort {
    public static void mergeSort(int [] arr, int startingIndex, int endingIndex) {
        if(startingIndex >= endingIndex) {
            return;
        }
        int middleIndex = startingIndex + (endingIndex - startingIndex)/2;
        mergeSort(arr, startingIndex, middleIndex);
        mergeSort(arr, middleIndex+1, endingIndex);
        merge(arr, startingIndex, middleIndex, endingIndex);
    }

    // public static void merge(int [] arr, int startingIndex, int middleIndex, int endingIndex) {
    //     int temp [] = new int[endingIndex-startingIndex+1];
    //     int start = startingIndex;
    //     int end = middleIndex+1;
    //     int pos = 0;
    //     while(start <= middleIndex && end <= endingIndex) {
    //         if(arr[start] < arr[end]) {
    //             temp[pos] = arr[start];
    //             start++;
    //         } else {
    //             temp[pos] = arr[end];
    //             end++;
    //         }
    //         pos++;
    //     }
    //     // If left part has more elements
    //     while(start <= middleIndex) {
    //         temp[pos++] = arr[start++];
    //     }

    //     // If right part has more elements
    //     while(end <= middleIndex) {
    //         temp[pos++] = arr[end++];
    //     }

    //     // copy temp to original array
    //     for(pos = 0, start = startingIndex; pos < temp.length;pos++,start++){
    //         arr[start] = temp[pos];
    //     }
    // }

    public static void merge(int [] arr, int startingIndex, int middleIndex, int endingIndex) {
        
        int length1 = middleIndex - startingIndex + 1;
        int length2 = endingIndex - middleIndex;

        int [] first = new int[length1];
        int [] second = new int[length2];

        // copy values
        int pos = startingIndex;
        for(int i=0;i<length1;i++) {
            first[i] = arr[pos];
            pos++;
        }
        pos = middleIndex+1;
        for(int i=0;i<length2;i++) {
            second[i] = arr[pos];
            pos++;
        }

        // merge 2 sorted arrays
        int index1= 0;
        int index2 = 0;
        pos = startingIndex;
        while(index1 < length1 && index2 < length2) {
            if(first[index1] < second[index2] ) {
                arr[pos] = first[index1];
                index1++;
            } else {
                arr[pos] = second[index2];
                index2++;
            }
            pos++;
        }

        while(index1 < length1) {
            arr[pos] = first[index1];
            index1++;
            pos++;
        }

        while(index2 < length2) {
            arr[pos] = second[index2];
            index2++;
            pos++;
        }
    }

    public static void main(String[] args) {
        int [] arr = new int[]{6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
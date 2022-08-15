package Day_1;

import java.util.*;

class pair {
    long first;
    long second;
    public pair(long first, long second){
        this.first = first;
        this.second = second;
    }
}

public class Ques2 {
    static enum TYPE_ARRAY {
        ASCENDING,
        DESCENDING,
        DESCENDING_ROTATED,
        ASCENDING_ROTATED
    }

    public static pair maxNtype(long arr[], long n) {
        long minElement = arr[0];
        long maxElement = arr[0];
        for(int i=0;i<(int)n;i++){
            maxElement = Math.max(maxElement, arr[i]);
            minElement = Math.min(minElement, arr[i]);
        }
        if(maxElement == arr[0] && minElement == arr[(int)n-1]){
            return new pair(2, maxElement);
        } else if(minElement == arr[0] && maxElement == arr[(int)n-1]){
            return new pair(1, maxElement);
        } else if(arr[0] < arr[(int)n-1]){
            return new pair(3, maxElement);
        } else {
            return new pair(4, maxElement);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        long number = scan.nextLong();
        long arr [] = new long[100000];
        for(int i=0;i<(int)number;i++){
            arr[i] = scan.nextLong();
        }
        pair answer = maxNtype(arr, number);
        switch((int)answer.first){
            case 1: System.out.println("Type of Array is: " + TYPE_ARRAY.ASCENDING); break;
            case 2: System.out.println("Type of Array is: " + TYPE_ARRAY.DESCENDING); break;
            case 3: System.out.println("Type of Array is: " + TYPE_ARRAY.DESCENDING_ROTATED); break;
            case 4: System.out.println("Type of Array is: " + TYPE_ARRAY.ASCENDING_ROTATED); break;
            default:
        }
        System.out.println("Maximum element of array is: " + answer.second);
        scan.close();
        
    }
}

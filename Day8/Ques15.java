package Day8;

// Exceptionally odd

import java.util.*;

public class Ques15 {
    /***
     * USING HASHMAP
     * @param arr
     * @param n
     * @return
     */
    public static int getOddOccurrence(int[] arr, int n) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            if(frequencyMap.containsKey(arr[i])){
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            } else {
                frequencyMap.put(arr[i],1);
            }
        }
        
        for(int x: frequencyMap.keySet()){
            if(frequencyMap.get(x) % 2 != 0){
                return x;
            }
        }
        return -1;
    }

    /***
     * USING XOR OPERATOR
     * @param arr
     * @param n
     * @return
     */
    public static int getOddOccurrenceXOR(int[] arr, int n) {
        int xorr = 0;
        for(int i=0;i<n;i++){
            xorr = xorr ^ arr[i];
        }
        return xorr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr [] = new int[100000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int oddNumber = getOddOccurrence(arr, n);
        if(oddNumber != -1){
            System.out.println("Odd number is: " + oddNumber);
        } else {
            System.out.println("There is no odd number");
        }
        scan.close();
    }
}

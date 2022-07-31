package Day15;

// Find ceil and floor

import java.util.*;

class Pair{
    int floor, ceil;

    Pair(){
        this.floor = 0;
        this.ceil = 0;
    }

    Pair(int floor, int ceil){
        this.floor = floor;
        this.ceil = ceil;
    }

    public int getFloor(){
        return this.floor;
    }

    public int getCeil(){
        return this.ceil;
    }
}

public class Ques2 {
    public static Pair getFloorAndCeil(int[] arr, int n, int x) {
        int floor = -1;
        int ceil = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] <= x){
                floor = Math.max(floor, arr[i]);
            }
            if(arr[i] >= x){
                ceil = Math.min(ceil, arr[i]);
            }
        }
        if(ceil == Integer.MAX_VALUE){
            ceil = -1;
        }
        return new Pair(floor, ceil);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[10000000];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        int x = scan.nextInt();
        Pair answer = getFloorAndCeil(arr, n, x);
        System.out.println("Floor of " + x + " is: " + answer.getFloor());
        System.out.println("Ceil of " + x + " is: " + answer.getCeil());
        scan.close();
    }
}

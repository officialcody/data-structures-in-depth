package GFG.BitManipulation;

public class BitOperations {
    public static int getIthBit(int n, int i) {
        int bitmask = 1 << i;
        if((n&bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // example => n=10, i=2 -> 1010 converted to 1110
    public static int setIthBit(int n, int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }

    // example => n=10, i=1 -> 1010 converted to 1000
    public static int clearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitmask = newBit << i;
        return n | bitmask;
    }

    public static int clearlastibits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b =  (1<< i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }
}

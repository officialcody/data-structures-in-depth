package GFG.BitManipulation;

class OddOrEven {
    public static void oddOrEven(int n) {
        int bitmask = 1;
        if((n & bitmask) == 0) {
            System.out.println(n  + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }
    }

    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(8);
    }
}
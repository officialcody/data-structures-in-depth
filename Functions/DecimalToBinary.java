package Functions;

import java.util.*;

public class DecimalToBinary {
    public static int decimalToBinary(int number){
        int pow = 0;
        int binaryNumber = 0;
        while(number > 0){
            int remainder = number % 2;
            binaryNumber = binaryNumber + (remainder * (int)Math.pow(10, pow));
            pow++;
            number /= 2;
        }
        return binaryNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int binaryToDecimal = decimalToBinary(n);
        System.out.println("Decimal to Binary: " + binaryToDecimal);
        scan.close();
    }
}

package Functions;

import java.util.*;

public class BinaryToDecimal {
    public static int binaryToDecimal(int number){
        int pow = 0;
        int decimalNumber = 0;
        while(number > 0){
            int lastDigit = number%10;
            decimalNumber = decimalNumber + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            number /= 10;
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int binaryToDecimal = binaryToDecimal(n);
        System.out.println("Binomial Coefficient is: " + binaryToDecimal);
        scan.close();
    }
}

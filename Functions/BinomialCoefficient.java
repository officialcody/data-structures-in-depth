package Functions;

import java.util.Scanner;

public class BinomialCoefficient {
    public static long factorial(long number){
        long factorial = 1;
        while(number > 1){
            factorial *= number;
            number--;
        }
        return factorial;
    }

    public static long calculateBinomialCoefficient(long n, long r){
        return factorial(n)/(factorial(n-r) * factorial(r));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long r = scan.nextLong();
        long binomialCoeff = calculateBinomialCoefficient(n, r);
        System.out.println("Binomial Coefficient is: " + binomialCoeff);
        scan.close();
    }
}

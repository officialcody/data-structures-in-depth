package Patterns;

// Pascal's Triangle
import java.util.*;

public class PascalsTriangle {
    public static long factorial(long number) {
        long factorial = 1;
        while (number > 1) {
            factorial *= number;
            number--;
        }
        return factorial;
    }

    public static long calculateBinomialCoefficient(long n, long r) {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }

    public static void printPascalsTriangle(long number) {
        for (long i = 0; i <= number; i++) {
            for (long j = 0; j <= number - i; j++) {
                System.out.print(" ");
            }
            for (long j = 0; j <= i; j++) {
                System.out.print(calculateBinomialCoefficient(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long number = scan.nextLong();
        printPascalsTriangle(number);
        scan.close();
    }
}

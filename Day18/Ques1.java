package Day18;

import java.util.Scanner;

// Prime or not
public class Ques1 {
    public static boolean isPrimeOrNot(int number){
        int start = 2;
        while(start < number){
            if(start%number==0){
                return false;
            }
            start++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isPrime = isPrimeOrNot(number);
        if(isPrime){
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }
        scan.close();
    }
}

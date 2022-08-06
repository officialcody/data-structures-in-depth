package Day21;

// Leap or not
import java.util.*;

class Ques1 {
    public static boolean checkIfLeapYear(int year){
        return (year%4==0) ? ( (year%100==0) ? ( (year%400==0) ? true : false): true) : false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        boolean leapOrNot = checkIfLeapYear(year);
        if(leapOrNot){
            System.out.println("Its a leap year");
        } else {
            System.out.println("Its not a leap year");
        }
        scan.close();
    }
}
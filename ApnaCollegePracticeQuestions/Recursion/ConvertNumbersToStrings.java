package ApnaCollegePracticeQuestions.Recursion;

// input - 2019
// output - two zero one nine
public class ConvertNumbersToStrings {
    public static String getString(int n) {
        switch(n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }
    public static void convertNumbersToStrings(int number) {
        if(number == 0) {
            return;
        }
        int lastDigit = number % 10;
        convertNumbersToStrings(number/10);
        System.out.print(getString(lastDigit) + " ");
    }

    public static void main(String[] args) {
        int number = 2019;
        convertNumbersToStrings(number);
    }
}

package ApnaCollegePracticeQuestions.Recursion;

public class PrintBinaryStrings {
    public static void printBinaryStrings(int n, int lastCharacter, String str) {
        if(n == 0) {
            System.out.println(str);
            return;
        }

        printBinaryStrings(n-1, 0, str+"0");
        if(lastCharacter == 0) {
            printBinaryStrings(n-1, 1, str+"1");
        }
    }

    public static void main(String[] args) {
        int n = 3;
        printBinaryStrings(n, 0, "");
    }
}

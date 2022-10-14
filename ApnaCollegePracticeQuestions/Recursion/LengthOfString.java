package ApnaCollegePracticeQuestions.Recursion;

public class LengthOfString {
    public static int getLength(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return getLength(str.substring(1)) + 1;
    }

    public static void main(String[] args) {
        String str = "abncjonfkasdf";
        System.out.println(getLength(str));
    }
}

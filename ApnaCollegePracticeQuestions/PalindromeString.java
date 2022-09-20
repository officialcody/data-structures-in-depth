package ApnaCollegePracticeQuestions;

public class PalindromeString {
    public static boolean checkPalindromeString(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

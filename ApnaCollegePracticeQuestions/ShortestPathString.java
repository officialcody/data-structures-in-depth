package ApnaCollegePracticeQuestions;

public class ShortestPathString {
    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'N':
                    y += 1;
                    break;
                case 'S':
                    y -= 1;
                    break;
                case 'E':
                    x += 1;
                    break;
                case 'W':
                    x -= 1;
                    break;
            }
        }
        return (float)(Math.sqrt(x*x + y*y));
    }
}

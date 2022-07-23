package Day7;

// Operating an array

public class Ques2 {
    public boolean searchEle(int a[],int x) {
        for(int number: a) if(number == x) return true;
        return false;
	}
	public boolean insertEle(int a[],int y,int yi) {
	    for(int i=0;i<a.length;i++){
	        if(i == yi){
	            a[i] = y;
	            return true;
	        }
	    }
	    return false;
	}
	public boolean deleteEle(int a[],int z) {
	    for(int num: a) if(num == z) num = 0;
	    return true;
	}
}

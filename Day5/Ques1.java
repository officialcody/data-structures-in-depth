package Day5;

class MyStack {
    int top;
    int arr[] = new int[1000];

    MyStack() {
        top = -1;
    }
    
    void push(int a) {
        top++;
        arr[top] =a;
    } 
    
    int pop() {
        if(top < 0){
            return -1;
        }
        return arr[top--];
    }
}

public class Ques1 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.push(4);
        stack.pop();
        
    }
    
}

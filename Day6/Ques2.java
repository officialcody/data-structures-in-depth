package Day6;

// Implementing Queue using Array

class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue() {
		front=0;
		rear=0;
	}

	void push(int x) {
	    arr[rear++] = x;
	} 

	int pop() {
	    if(front == rear){
	        return -1;
	    }
	    return arr[front++];
	} 
}

public class Ques2 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(2);
        queue.push(3);
        queue.pop();
        queue.push(4);
        queue.pop();
    }
}

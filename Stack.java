package question2;

public class Stack {
    int top,maxsize;
    int[] stackArray;
    public Stack(int size){
        maxsize=size;
        top=-1;
        stackArray=new int[maxsize];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxsize-2;
    }
    public void push(int value) {
        if (top == maxsize - 1) {
            System.out.println("Stack is full.");
        }
        else {
            top++;
            stackArray[top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            int data1 = stackArray[top--];
            int data2=data1;
            return data2;
        }
    }


}

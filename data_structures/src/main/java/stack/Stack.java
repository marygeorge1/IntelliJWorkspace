package stack;

public class Stack {

    int[] arr=new int[10];
    int top=-1;

    public void push(int data){

        if(top==9){
            throw new OverFlowException("Stack is full");
        }

        top++;
        arr[top]=data;
    }

    public int pop(){
        if(top<0){
            throw new UnderFlowException("Stack is empty");
        }
        return arr[top--];
    }
}

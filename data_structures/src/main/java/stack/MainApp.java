package stack;

import java.util.Queue;

public class MainApp {
    public static void main(String[] args) {
        Stack myStack=new Stack();
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}

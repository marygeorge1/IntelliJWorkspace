package org.threaddemo;

public class PrintMessage {

    public void printTheMessage(String message) throws InterruptedException {
        System.out.print("[ "+message);
        Thread.sleep(2000);
        System.out.print(" ]");

    }
}

class PassMessage implements Runnable{

    String message;
    PrintMessage obj;
    public PassMessage(String msg,PrintMessage pm){
        message=msg;
        obj=pm;
        Thread t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            synchronized (obj){
                obj.printTheMessage(message);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MyMessages{
    public static void main(String[] args) {

        PrintMessage obj=new PrintMessage();
        PassMessage t1=new PassMessage("Hello",obj);
        PassMessage t2=new PassMessage("World",obj);
        PassMessage t3=new PassMessage("Java",obj);

    }
}

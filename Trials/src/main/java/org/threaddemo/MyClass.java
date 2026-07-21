package org.threaddemo;

public class MyClass {
    public static void main(String args[]){

        SecondClass t=new SecondClass();

        for(int i=0;i<6;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

class SecondClass implements Runnable{

    public SecondClass(){
        Thread t=new Thread(this,"secondclassThread");
        t.start();
    }

    @Override
    public void run() {
        for(int i=0;i<6;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

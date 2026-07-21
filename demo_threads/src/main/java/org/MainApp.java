package org;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {

        MyThread t1=new MyThread();
        MyNewThread t2=new MyNewThread();

        for(int i=0;i<5;i++){
            System.out.println("Main"+i);
            Thread.sleep(1000);
        }

        //t.t.join();
    }
}

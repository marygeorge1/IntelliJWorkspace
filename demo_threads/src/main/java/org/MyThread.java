package org;

public class MyThread implements Runnable{

    Thread t;

    public MyThread(){
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        for(int i=0;i<5;i++){
            System.out.println("MyThread"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

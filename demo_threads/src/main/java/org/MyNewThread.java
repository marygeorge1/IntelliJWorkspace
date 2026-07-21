package org;

public class MyNewThread extends Thread{

    public MyNewThread(){
        start();
    }

    public void run(){

        for(int i=0;i<5;i++){
            System.out.println("MyNewThread"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

package org.threaddemo;

public class ThreadCommunicationDemo {

    public static void main(String args[]){
        Q q=new Q();
        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

    }
}

class Q{

    int n;
    boolean valueSet=false;

    public synchronized void put(int n) throws InterruptedException {
        while(valueSet){
            wait();
        }
        this.n=n;
        System.out.println("Put: "+n);
        valueSet=true;
        notifyAll();

    }
    public synchronized int get() throws InterruptedException {
        while(!valueSet){
             wait();
        }
        valueSet=false;
        notifyAll();
        System.out.println("Got: "+n);
        return this.n;
    }
}

class Producer implements Runnable{

    int i=0;
    Q q;
    public Producer(Q q){
        this.q=q;
        Thread p=new Thread(this,"Producer");
        p.start();
    }

    public void run(){
        while (i<11){
            try {
                q.put(++i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

}

class Consumer implements Runnable{
    Q q;

    public Consumer(Q q){
        this.q=q;
        Thread c=new Thread(this,"Consumer");
        c.start();
    }

    public void run(){
        while(true){
            try {
                q.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

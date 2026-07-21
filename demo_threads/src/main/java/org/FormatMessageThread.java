package org;

public class FormatMessageThread extends Thread{
    FormatMessage formatter;
    String message;

    public FormatMessageThread(FormatMessage formatter,String message){
        this.formatter=formatter;
        this.message=message;
        start();
    }

//    public void run(){
//        try {
//            formatter.format(message);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public void run(){
        synchronized (formatter){
            try {
                formatter.format(message);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

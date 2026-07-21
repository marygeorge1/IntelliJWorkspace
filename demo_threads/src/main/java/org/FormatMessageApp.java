package org;

public class FormatMessageApp {
    public static void main(String[] args) throws InterruptedException {
        FormatMessage obj=new FormatMessage();
        FormatMessageThread t1=new FormatMessageThread(obj,"Mary");
        FormatMessageThread t2=new FormatMessageThread(obj,"Joby");
        FormatMessageThread t3=new FormatMessageThread(obj,"Hello");
        t1.join();
        t2.join();
        t3.join();
    }
}

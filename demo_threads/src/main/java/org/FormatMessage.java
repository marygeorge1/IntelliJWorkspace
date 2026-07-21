package org;

public class FormatMessage {

     public void format(String msg) throws InterruptedException {
        System.out.print("{"+msg);
        Thread.sleep(5000);
        System.out.println("}");;

    }
}

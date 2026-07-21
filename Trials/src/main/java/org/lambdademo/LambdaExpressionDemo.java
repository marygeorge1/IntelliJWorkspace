package org.lambdademo;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaExpressionDemo {
    int instanceNum=20;

    public static void main(String[] args) {

        //Expression Lambda
        StringManipulation ref=(s)->s.toUpperCase();
        System.out.println(ref.stringOp("Mary"));

        ref=(s)->s.toLowerCase();
        System.out.println(ref.stringOp("Mary"));

        //Block Lambda
        ref=(s)->{
            String result=null;
            result="Hello "+s;
            return result;
        };
        System.out.println(ref.stringOp("Mary"));

        int number=10;
        NumberManipulation nRef=(num)->num+number;
        System.out.println(nRef.NumberOp(20));

        //Variable Capture
        /*nRef=(num)->{
            number++;
        };*/

        //Predefined functional Interface
        Consumer<Integer> c=(n)-> System.out.println("Consumed "+n);
        c.accept(10);
        Predicate<Integer> p=(n)->n%2==0;
        System.out.println("Even "+p.test(10));
        System.out.println("Even "+p.test(11));





    }


}


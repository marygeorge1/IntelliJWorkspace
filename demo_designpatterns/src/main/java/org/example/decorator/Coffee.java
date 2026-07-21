package org.example.decorator;

public class Coffee implements Beverage{
    @Override
    public int cost() {
        return 2;
    }
}

package org.example.decorator;

public class CreamDecorator extends Decorator{

    private Beverage beverage;

    public CreamDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost()+3;
    }
}

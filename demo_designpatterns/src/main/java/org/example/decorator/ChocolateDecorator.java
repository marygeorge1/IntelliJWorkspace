package org.example.decorator;

public class ChocolateDecorator extends Decorator {

    private Beverage beverage;

    public ChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return this.beverage.cost()+5;
    }
}

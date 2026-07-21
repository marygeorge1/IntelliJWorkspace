package org.example.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {

        //We can create different beverages by adding different decorators
        Beverage beverage=new ChocolateDecorator(new Coffee());
        System.out.println("Cost of Chocolate Coffee - "+beverage.cost());

        beverage=new CreamDecorator(new ChocolateDecorator(new Coffee()));
        System.out.println("Cost of Chocolate coffee with cream - "+beverage.cost());

    }
}

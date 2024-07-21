package Patron_Decorateur;

public class Main {
    public static void main(String[] args) {

        Beverage_Component beverage = new Espresso_ConcreteComponent();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage_Component beverage2 = new HouseBlend_ConcreteComponent();
        beverage2 = new Mocha_ConcreteDecorator(beverage2);
        beverage2 = new Whip_ConcreteDecorator(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}

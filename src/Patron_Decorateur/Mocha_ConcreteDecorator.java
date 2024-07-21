package Patron_Decorateur;

public class Mocha_ConcreteDecorator extends Condiment_Decorator{

    Beverage_Component beverage;

    public Mocha_ConcreteDecorator(Beverage_Component beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}

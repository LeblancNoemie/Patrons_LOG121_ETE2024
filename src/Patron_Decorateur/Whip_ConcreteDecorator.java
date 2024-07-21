package Patron_Decorateur;

public class Whip_ConcreteDecorator extends Condiment_Decorator{

    Beverage_Component beverage;

    public Whip_ConcreteDecorator(Beverage_Component beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}

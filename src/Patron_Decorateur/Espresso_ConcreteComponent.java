package Patron_Decorateur;

public class Espresso_ConcreteComponent extends Beverage_Component{

    public Espresso_ConcreteComponent() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

package Patron_Decorateur;

public class HouseBlend_ConcreteComponent extends Beverage_Component{
    public HouseBlend_ConcreteComponent() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

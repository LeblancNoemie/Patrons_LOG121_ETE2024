package Patron_Decorateur;

public abstract class Beverage_Component {
    String description = "Unknown Beverage";

    public String getDescription(){
        return this.description;
    }

    public abstract double cost();
}

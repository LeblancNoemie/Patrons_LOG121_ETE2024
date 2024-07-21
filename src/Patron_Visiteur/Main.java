package Patron_Visiteur;

import Patron_Visiteur.Nodes.Building;
import Patron_Visiteur.Nodes.Employee;

public class Main {
    public static void main(String[] args) {

        ExportVisitor visitor = new ExportVisitor();

        Building b1 = new Building("École primaire","123 Maple Ave, Vancouver, BC V5K 1N6");
        Employee e1 = new Employee("John","John","Medical Technician");

        b1.accept(visitor);
        e1.accept(visitor);
    }
}

package Patron_Visiteur;

import Patron_Visiteur.Nodes.Building;
import Patron_Visiteur.Nodes.Employee;
import Patron_Visiteur.Nodes.Product;

public interface IVisitor {
    void exportForBuilding(Building building);
    void exportForEmployee(Employee employee);
    void exportForProduct(Product product);
}

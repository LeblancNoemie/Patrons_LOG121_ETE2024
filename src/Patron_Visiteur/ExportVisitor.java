package Patron_Visiteur;

import Patron_Visiteur.Nodes.Building;
import Patron_Visiteur.Nodes.Employee;
import Patron_Visiteur.Nodes.Product;

import java.io.FileWriter;
import java.io.IOException;

public class ExportVisitor implements IVisitor{

    private String path = "C:\\Documents\\";
    @Override
    public void exportForBuilding(Building building) {
        String fileName = this.path +"buildingXML.txt";
        String content = building.getXML();

        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(content);
            fw.close();

            System.out.println("File created successfully: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exportForEmployee(Employee employee) {
        String fileName = this.path +"employeeXML.txt";
        String content = employee.getXML();

        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(content);
            fw.close();

            System.out.println("File created successfully: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void exportForProduct(Product product) {
        String fileName = this.path +"productXML.txt";
        String content = product.getXML();

        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(content);
            fw.close();

            System.out.println("File created successfully: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

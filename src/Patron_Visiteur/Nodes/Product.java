package Patron_Visiteur.Nodes;

import Patron_Visiteur.INode;
import Patron_Visiteur.IVisitor;

public class Product implements INode {

    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getXML(){
        String message = "<Product> \n" +
                "\t<Type> "+this.getType()+" <Type>\n"+
                "\t<Price> "+ this.getPrice()+" <Price>\n"+
                "</Product> \n";
        return message;
    }

    /**
     * Méthode héritée de l'interface INode
     * Elle appelle le visiteur passé en paramètre et celui-ci appellé la méthode spécifique à l'object Product
     * pour exporter son contenu dans un fichier .txt
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.exportForProduct(this);
    }
}

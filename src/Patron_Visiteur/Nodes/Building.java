package Patron_Visiteur.Nodes;

import Patron_Visiteur.INode;
import Patron_Visiteur.IVisitor;

public class Building implements INode {
    private String type;
    private String address;

    public Building(String type, String address) {
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getXML(){
       String message = "<Building> \n" +
               "\t<Type> "+this.getType()+" <Type>\n"+
               "\t<Address> "+ this.getAddress()+" <Address>\n"+
               "</Address> \n";
       return message;
    }

    /**
     * Méthode héritée de l'interface INode
     * Elle appelle le visiteur passé en paramètre et celui-ci appellé la méthode spécifique à l'object Building
     * pour exporter son contenu dans un fichier .txt
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.exportForBuilding(this);
    }
}

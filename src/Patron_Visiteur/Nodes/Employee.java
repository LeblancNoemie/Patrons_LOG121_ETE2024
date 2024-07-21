package Patron_Visiteur.Nodes;

import Patron_Visiteur.INode;
import Patron_Visiteur.IVisitor;

public class Employee implements INode {

    private String firstName;
    private String lastName;
    private String role;

    public Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String getXML(){
        String message = "<Employee> \n" +
                "\t<Firstname> "+this.getFirstName()+" <FirstName>\n"+
                "\t<Lastname> "+ this.getLastName()+" <Lastename>\n"+
                "\t<Role> "+ this.getRole()+" <Role>\n"+
                "</Employee> \n";
        return message;
    }

    /**
     * Méthode héritée de l'interface INode
     * Elle appelle le visiteur passé en paramètre et celui-ci appellé la méthode spécifique à l'object Employee
     * pour exporter son contenu dans un fichier .txt
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.exportForEmployee(this);
    }
}

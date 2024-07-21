package Patron_Visiteur;

public interface INode {
    public void accept(IVisitor visitor);
    public String getXML();
}

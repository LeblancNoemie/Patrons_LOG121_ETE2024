package Patron_Strategie;

public class ComputerContext {
    private IStrategie strategie;

    public void setStrategie(IStrategie strategie){
        this.strategie = strategie;
    }

    public void executeStrategy(String word){
        this.strategie.execute(word);
    }
}

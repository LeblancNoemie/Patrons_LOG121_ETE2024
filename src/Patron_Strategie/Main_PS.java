package Patron_Strategie;

public class Main_PS {

    public void executeMain(){
        StrategyReverseEncryption re = new StrategyReverseEncryption();
        StrategyCeasarCipherEncryption cce = new StrategyCeasarCipherEncryption();

        ComputerContext context = new ComputerContext();
        context.setStrategie(re);
        context.executeStrategy("Hello world!");
    }
}

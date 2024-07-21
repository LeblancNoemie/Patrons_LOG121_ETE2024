package Patron_Strategie;

public class Main {
    public static void main(String[] args) {
        StrategyReverseEncryption re = new StrategyReverseEncryption();
        StrategyCeasarCipherEncryption cce = new StrategyCeasarCipherEncryption();

        ComputerContext context = new ComputerContext();
        context.setStrategie(re);
        context.executeStrategy("Hello world!");
    }
}

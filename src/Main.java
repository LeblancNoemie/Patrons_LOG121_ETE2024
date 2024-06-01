import Patron_Composite.Main_PC;
import Patron_MVC_Iterateur.Main_MVC_IT;
import Patron_Mediateur.Main_PM;
import Patron_Observateur.Main_PO;
import Patron_Strategie.IStrategie;
import Patron_Strategie.Main_PS;
import Patron_Strategie.StrategyCeasarCipherEncryption;
import Patron_Strategie.StrategyReverseEncryption;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //Only call main method of selected patron
        Main_PS mainPs = new Main_PS();
        Main_PC mainPc = new Main_PC();
        Main_PM mainPm = new Main_PM();
        Main_MVC_IT mainMvcIt = new Main_MVC_IT();
        Main_PO mainPo = new Main_PO();
        
        mainPs.executeMain();

    }
}
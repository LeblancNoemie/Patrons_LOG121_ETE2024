package Patron_Strategie;

public class StrategyReverseEncryption implements IStrategie{
    @Override
    public void execute(String word) {
        String encrypted_word = "";

        for(int i = word.length()-1; i >= 0 ; i--){
            encrypted_word += word.charAt(i);
        }
        System.out.println("Encrypted word: " + encrypted_word);
    }
}

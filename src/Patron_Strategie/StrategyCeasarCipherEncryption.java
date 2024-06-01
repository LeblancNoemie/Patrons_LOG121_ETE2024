package Patron_Strategie;

public class StrategyCeasarCipherEncryption implements IStrategie{

    @Override
    public void execute(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + 2) % 26 + base);
            }
            result.append(ch);
        }
        System.out.println("Encrypted word: " + result);
    }
}

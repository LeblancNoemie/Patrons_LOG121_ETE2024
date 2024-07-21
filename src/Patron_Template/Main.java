package Patron_Template;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Recursivity r = new Recursivity();

        List<Integer> a = new ArrayList<>();
        a.add(55);
        a.add(13);

        List<Integer> b = new ArrayList<>();
        b.add(55);
        b.add(59);

        List<Integer> c = r.combine(a,b);
        System.out.println(c);
    }
}

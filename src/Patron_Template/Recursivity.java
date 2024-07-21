package Patron_Template;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Recursivity {

    private List<Integer> getIntVariables(String input){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        List<Integer> results = new ArrayList<>();
        while(matcher.find()){
            results.add(Integer.parseInt(matcher.group()));
        }
        System.out.println("Parsed values ("+ results.size()+"): " +  results);
        return results;
    }

    public void sort(List<Integer> list){
        divide(list);
        //sort
        //combine?
    }

    public void divide(List<Integer> list){
        int middle = list.size()/2;
        List<Integer> left = list.subList(0 , middle);
        List<Integer> right = list.subList(middle, list.size());
    }

    public List<Integer> combine(List<Integer> left, List<Integer> right){
        List<Integer> combinedList = new ArrayList<>();
        int firstLeft = left.get(0);
        int firstRight = right.get(0);

        if(firstLeft > firstRight){
            combinedList.addAll(right);
            combinedList.addAll(left);
        }else{
            if (firstRight > firstLeft){
                combinedList.addAll(left);
                combinedList.addAll(right);
            }else{
                //Situation où les 2 premiers chiffres des deux listes sont identiques => à retravailler
                combinedList.addAll(left);
                combinedList.addAll(right);
            }
        }
        return combinedList;
    }

}

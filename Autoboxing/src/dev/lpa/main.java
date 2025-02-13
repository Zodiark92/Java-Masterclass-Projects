package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(5); //manually boxing (unnecessary)
        Integer deprecatedMethod = new Integer(15);
        int unboxedInt = boxedInt.intValue(); //manually unboxing (unnecessary)

        //Automatic boxing/unboxing
        Integer boxedValue = 15;
        int unboxedVale = boxedValue;
        System.out.println(boxedValue.getClass().getName());

        Double boxedDouble = getPrimitiveDouble();
        double unboxedDouble = getDoubleObject();

        Integer[] wrapperIntegers = new Integer[10];
        wrapperIntegers[0] = 5;
        System.out.println(Arrays.toString(wrapperIntegers));

        Character[] characters = {'a', 'b', 'c'};
        System.out.println(Arrays.toString(characters));

        var ourList = getList(1,3,5,7);
        var ourListOf = List.of(1,3,5,7);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer... args) {

        ArrayList<Integer> aList = new ArrayList<>();
        for(int i : args) {
            aList.add(i);
        }
        return aList;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(5.5);
    }

    private static double getPrimitiveDouble(){
        return 5.5;
    }
}

package dev.lpa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 10;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("Array length = " + arrayLength);
        System.out.println("Last element = " + firstTen[arrayLength - 1]);

        int[] newArray;
        newArray = new int[5];

        for(int i = 0; i< newArray.length; i++){
            newArray[i] = newArray.length - i;
        }

        for(int i=0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();

        for(int element : newArray){
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(newArray));

        Object objecyVariable = newArray;
        if(objecyVariable instanceof int[]){
            System.out.println("the variable is a instance of a integer array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("Hello");
        objectArray[3] = newArray; //nested array

    }
}
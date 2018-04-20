package com.timbuchalka;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
        AutoboxingAndUnboxing();
    }

    public static void AutoboxingAndUnboxing() {

        String[] strArray = new String[10];

        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

//        ArrayList<int> inArrayList = new ArrayList<int>();

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(22.00);

        ArrayList<Integer> intArrayLIst = new ArrayList<Integer>();
//        for(int i=0; i<=10; i++ ) {
//            intArrayLIst.add(Integer.valueOf(i)); // autoboxing - taking primitive type into wrapper
//        }
//
//        for(int i=0; i<=10; i++ ) {
//            System.out.println(i + " ->" + intArrayLIst.get(i).intValue()); // Unboxing converting back into primitive type
//        }


        Integer myIntValue = 56; // java is doing automatically -> Integer/valueOf(56);
        int myInt = myIntValue; // java is doing automatically -> myInt.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();

        for (double dbl = 0.0; dbl<=10.0; dbl+=0.5) {
            myDoubleValues.add(dbl); // Double.valueOf(dbl))
        }

        for(int i=0; i<myDoubleValues.size(); i++ ) {
            double value = myDoubleValues.get(i); // myDoubleValues.get(i).doubleValue()
            System.out.println(i + " -> " + value);
        }

    }

}

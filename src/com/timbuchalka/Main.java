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

    public static void AutoboxingAndUnboxingChallenge() {

        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("National Australia Bank");

        if(bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch created");
        }

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }

    }

    public static void linkedList() {

        Customer2 customer = new Customer2("Time", 23.23);
        Customer2 anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("balance for " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(2);
        intList.add(5);

        for( int i = 0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,8);

        for( int i = 0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        
    }







    public static void main(String[] args) {
//        AutoboxingAndUnboxing();
//        AutoboxingAndUnboxingChallenge();
        linkedList();
    }

}

package com.hadlak.banking;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;

    public void addCustomer(String name, double initTransActionAmount){
        customers.add(Customer.createCustomer(name, initTransActionAmount));
    }

    public void addTransaction(String name, double transaction){

    }
}

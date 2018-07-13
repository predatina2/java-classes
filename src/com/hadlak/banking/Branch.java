package com.hadlak.banking;

import java.util.ArrayList;

public class Branch {

    private Customers customers;

    public Branch(){
        this.customers = Customers.createEmptyCustomerList();
    }

    public boolean addCustomer(String customerName, double initTransActionAmount){
        if (customers.addCustomer(customerName, initTransActionAmount)){
            return true;
        } else {
            return false;
        }
    }

    public void addTransaction(String customerName, double transaction){

    }

}

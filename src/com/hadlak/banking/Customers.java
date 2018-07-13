package com.hadlak.banking;

import java.util.ArrayList;

public class Customers extends ArrayList<Customer> {


    public static Customers createEmptyCustomerList(){
        return new Customers();
    }

    public boolean addCustomer(String customerName, double initTransactionAmount) {
        if (doesCustomerExist(customerName)) {
            return false;
        } else {
            add(Customer.createCustomer(customerName, initTransactionAmount));
            return true;
        }

    }

    public boolean doesCustomerExist(String customerName){

        for (int i = 0; i <= size(); i++){
            if (get(i).getName().equals(customerName)){
                return true;
            }
        }
        return false;
    }

}

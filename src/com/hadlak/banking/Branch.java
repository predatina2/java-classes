package com.hadlak.banking;

import java.util.ArrayList;

public class Branch {

    private ArrayList<Customer> customers;
    private String branchName;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public static Branch createBranch(String branchName) {
        return new Branch(branchName);
    }

    public void printCustomers(boolean printTransactions) {
        for (Customer customer : customers) {
            System.out.println("Customer Name: " + customer.getName());
            if (printTransactions) {
                customer.printTransactions();
            }
        }
    }

    public boolean addCustomer(String customerName, double initTransactionAmount) {

        if (doesCustomerExist(customerName)) {
            return false;
        } else {
            customers.add(Customer.createCustomer(customerName, initTransactionAmount));
            return true;
        }
    }

    public boolean addTransaction(String customerName, double transactionAmount) {
        int index = indexOf(customerName);

        if (index == -1) {
            return false;
        } else {
            Customer customer = customers.get(index);
            customer.addTransactions(transactionAmount);
            return true;
        }
    }

    public boolean doesCustomerExist(String customerName) {

        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return true;
            }
        }
        return false;
    }

    private int indexOf(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public String getBranchName() {
        return branchName;
    }

}

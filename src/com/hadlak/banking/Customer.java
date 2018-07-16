package com.hadlak.banking;

import java.util.ArrayList;

public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    private Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public static Customer createCustomer(String name, double initTransactionAmount) {
        ArrayList<Double> transactions = new ArrayList<Double>();
        transactions.add(Double.valueOf(initTransactionAmount));
        return new Customer(name, transactions);
    }

    public void printTransactions() {
        System.out.println("Transactions: ");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("   " +  i + " " +  transactions.get(i).doubleValue());
        }
    }

    public boolean addTransactions(double transaction) {
        transactions.add(Double.valueOf(transaction));
        return true;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

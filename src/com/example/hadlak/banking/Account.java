package com.example.hadlak.banking;

import java.util.ArrayList;

public class Account {

    public String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance now: " + this.balance);
        } else {
            System.out.println("Can not deposit negative sums.");
        }
    }

    public void withdraw(int amount){
        int withdrawal = - amount;
        if (this.balance + withdrawal < 0){
            System.out.println("Balance is now high enough for this withdraw");
        }
        if (withdrawal < 0) {
            transactions.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawed. Balance now: " + this.balance);
        } else {
            System.out.println("Can not withdraw negative sums.");
        }
    }

    public void calculateBalance(){
        this.balance = 0;
        for (int i : this.transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}

package com.hadlak.banking;

import java.util.Scanner;

public class BankingApp {

    private static Scanner inputScanner = new Scanner(System.in);
    private Bank bank;

    public void startApp(String bankName) {
        this.bank = new Bank(bankName);
        boolean quit = false;

        listOptions();
        System.out.println("");
        while (!quit) {
            try {
                System.out.println("What do you want to do? Press a number.");
                int option = inputScanner.nextInt();
                inputScanner.nextLine();
                switch (option) {
                    case 0:
                        listOptions();
                        break;
                    case 1:
                        printCustomers();
                        break;
                    case 2:
                        addBranch();
                        break;
                    case 3:
                        addCustomer();
                        break;
                    case 4:
                        addTransaction();
                        break;
                    case 9:
                        quit = true;
                        break;
                    default:
                        quit = true;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                inputScanner.nextLine();
            }
        }
    }

    public void listOptions() {

        System.out.println("Your options in your contact list: \n");
        System.out.println("Press 0: To list the options.");
        System.out.println("Press 1: To print the entire customer list.");
        System.out.println("Press 2: To add a new branch.");
        System.out.println("Press 3: To add a new customer.");
        System.out.println("Press 4: To make a transaction for an existing customer.");
        System.out.println("Press 9: To quit the application.");

    }

    public boolean printCustomers() {
        String branchName;
        boolean printTransactions;

        System.out.println("Enter the branch name for which you wnt to print the customers:");
        branchName = inputScanner.nextLine();
        System.out.println("Do you also want to print the transactions of the customers?");
        printTransactions = inputScanner.nextBoolean();
        inputScanner.nextLine();

        return bank.printCustomers(branchName, printTransactions);
    }

    public boolean addBranch() {
        String branchName;

        System.out.println("Enter the branch name which you want to add to the bank:");
        branchName = inputScanner.nextLine();

        if (bank.addBranch(branchName)) {
            return true;
        } else {
            System.out.println("branch name already exists");
            return false;
        }
    }

    public boolean addCustomer() {

        String branchName;
        String customerName;
        double initTransactionAmount;

        System.out.println("Enter the branch name for which you want to add the customer");
        branchName = inputScanner.nextLine();
        System.out.println("Enter the name of the new customer");
        customerName = inputScanner.nextLine();
        System.out.println("Enter the initial transaction amount of the new customer.");
        initTransactionAmount = inputScanner.nextDouble();
        inputScanner.nextLine();

        if (bank.addCustomer(branchName, customerName, initTransactionAmount)) {
            return true;
        } else {
            System.out.println("either branch does not exist or customer already exists");
            return false;
        }
    }

    public boolean addTransaction() {

        String branchName;
        String customerName;
        double transactionAmount;

        System.out.println("Enter the branch name of the customer");
        branchName = inputScanner.nextLine();
        System.out.println("Enter the name of the customer for which you want to add the transaction");
        customerName = inputScanner.nextLine();
        System.out.println("Enter the transactionAmount for the customer.");
        transactionAmount = inputScanner.nextDouble();
        inputScanner.nextLine();

        if (bank.addTransaction(branchName, customerName, transactionAmount)) {
            return true;
        } else {
            return false;
        }
    }
}

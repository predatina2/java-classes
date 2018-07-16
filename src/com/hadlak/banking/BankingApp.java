package com.hadlak.banking;

import java.util.ArrayList;

public class BankingApp {

    private ArrayList<Branch> branches;

    public BankingApp() {
        branches = new ArrayList<Branch>();
    }

    public static void startApp(){
        boolean quit = false;
        listOptions();
        System.out.println("");
        while (!quit) {
            System.out.println("What do you want to do? Press a number.");
            int option = inputScanner.nextInt();
            inputScanner.nextLine();
            switch (option) {
                case 0:
                    listGlobalOptions();
                    break;
                case 1:
                    printContactList();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContactName();
                    break;
                case 9:
                    quit = true;
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public void listOptions(){

        System.out.println("Your options in your contact list: \n");
        System.out.println("Press 0: To list the options.");
        System.out.println("Press 1: To print the entire contact list.");
        System.out.println("Press 2: To add a new contact.");
        System.out.println("Press 3: To modify an existing contact.");
        System.out.println("Press 4: To delete a contact.");
        System.out.println("Press 5: To find a contact.");
        System.out.println("Press 9: To quit the application.");

    }

    public boolean printCustomers(String branchName, boolean printTransactions){
        if (!doesBranchExist(branchName)){
            return false;
        } else {
            Branch branch = branches.get(indexOf(branchName));
            return true;
        }
    }

    public boolean addBranch(String branchName) {
        if (doesBranchExist(branchName)) {
            return false;
        } else {
            branches.add(Branch.createBranch(branchName));
            return true;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initTransactionAmount){
        if (!doesBranchExist(branchName)) {
            return false;
        } else {
            Branch branch = branches.get(indexOf(branchName));
            if (branch.addCustomer(customerName, initTransactionAmount)){
                return true;
            } else {
                return false;
            }

        }
    }

    public boolean addTransaction(String branchName, String customerName, double initTransactionAmount){
        if (!doesBranchExist(branchName)) {
            return false;
        } else {
            Branch branch = branches.get(indexOf(branchName));
            if (branch.addTransaction(customerName, initTransactionAmount)){
                return true;
            } else {
                return false;
            }

        }
    }

    public boolean doesBranchExist(String branchName) {
        for (int i = 0; i <= branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }

    private int indexOf(String branchName) {
        for (int i = 0; i <= branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }
}

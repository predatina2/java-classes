package com.example.hadlak.banking;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        branches = new ArrayList<Branch>();
        this.name = name;
    }

    public boolean printCustomers(String branchName, boolean printTransactions) {

        if (!doesBranchExist(branchName)) {
            return false;
        } else {
            Branch branch = branches.get(indexOf(branchName));
            branch.printCustomers(printTransactions);
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

    public boolean addCustomer(String branchName, String customerName, double initTransactionAmount) {

        if (!doesBranchExist(branchName)) {
            return false;
        } else {
            Branch branch = branches.get(indexOf(branchName));
            return branch.addCustomer(customerName, initTransactionAmount);
        }
    }

    public boolean addTransaction(String branchName, String customerName, double transactionAmount) {

        int index;
        index = indexOf(branchName);

        if (index == -1) {
            return false;
        } else {
            Branch branch = branches.get(index);
            if (branch.addTransaction(customerName, transactionAmount)) {
                return true;
            } else {
                return false;
            }

        }
    }

    private boolean doesBranchExist(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }

    private int indexOf(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getBranchName().equals(branchName)) {
                return i;
            }
        }
        return -1;
    }
}

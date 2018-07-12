package com.hadlak.mobile_phone;

import java.util.Scanner;

public class MobilePhoneApplication {

    private String myNumber;
    private Contacts phoneContacts;
    private Scanner inputScanner;

    public MobilePhoneApplication(String myNumber) {
        this.myNumber = myNumber; //check: variable und parameter gleicher name
        phoneContacts = new Contacts();
        inputScanner = new Scanner(System.in);
    }

    public void startMobilePhoneApplication() {
        boolean quit = false;
        listGlobalOptions();
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

    public void listGlobalOptions() {
        System.out.println("Your options in your contact list: \n");
        System.out.println("Press 0: To list the options.");
        System.out.println("Press 1: To print the entire contact list.");
        System.out.println("Press 2: To add a new contact.");
        System.out.println("Press 3: To modify an existing contact.");
        System.out.println("Press 4: To delete a contact.");
        System.out.println("Press 5: To find a contact.");
        System.out.println("Press 9: To quit the application.");
    }

    public void listModifyOptions() {
        System.out.println("Your options in the modify panel of your contact list: \n");
        System.out.println("Press 1: To change the name.");
        System.out.println("Press 2: To change the phone number.");
    }

    public void listSearchResultOptions() {
        System.out.println("Your options in the search result menu of your contact list: \n");
        System.out.println("Press 1: To change the name.");
        System.out.println("Press 2: To change the phone number.");
        System.out.println("Press 3: To delete the contact.");
    }

    public void printContactList() {
        phoneContacts.printContacts();
    }

    public void addNewContact() {
        String name;
        String phoneNumber;

        System.out.println("enter the name of the new contact: ");
        name = inputScanner.nextLine();

        if (!phoneContacts.doesContactExist(name)) {

            System.out.println("enter the phone number of the new contact: ");
            phoneNumber = inputScanner.nextLine();

            phoneContacts.addContact(name, phoneNumber);

            System.out.println("new contact added: " + name + ", " + phoneNumber);
        } else {
            System.out.println("Contact already exists.");
        }
    }

    public void modifyContact() {
        String oldName;

        System.out.println("enter the name of the contact you want to modify: ");
        oldName = inputScanner.nextLine();

        if (phoneContacts.doesContactExist(oldName)) {
            String oldPhoneNumber = phoneContacts.getPhoneNumber(oldName);
            int option = 0;

            listModifyOptions();

            option = inputScanner.nextInt();
            inputScanner.nextLine();
            switch (option) {
                case 1:
                    modifyContactName(oldName);
                    break;
                case 2:
                    modifyContactPhoneNumber(oldName, oldPhoneNumber);
                    break;
                default:
                    listModifyOptions();
                    break;
            }
        } else {
            System.out.println(oldName + " doesn't exist.");
        }
    }

    public void modifyContactName(String oldName) {
        System.out.println("Changing the name for contact: " + oldName);
        System.out.println("enter the new name: ");
        String newName = inputScanner.nextLine();
        if (phoneContacts.modifyName(oldName, newName)){
            System.out.println("changed contact name from " + oldName + " to " + newName);
        } else {
            System.out.println("couldn't change name. Could be one of the following reasons:");
            System.out.println("1. your search name doesn't exist");
            System.out.println("2. your new name already exists");
        }

    }

    public void modifyContactPhoneNumber(String oldName, String oldPhoneNumber) {
        System.out.println("Changing the phone number for contact: " + oldName);
        System.out.println("enter the new phone number: ");
        String newPhoneNumber = inputScanner.nextLine();
        if (phoneContacts.modifyPhoneNumber(oldName, newPhoneNumber)){
            System.out.println("changed phone number for contact name " + oldName
                    + " from " + oldPhoneNumber + " to " + newPhoneNumber);
        } else {
            System.out.println(oldName + " does not exist.");
        }

    }

    public void removeContact() {
        System.out.println("enter the name of the contact you want to remove: ");
        String name = inputScanner.nextLine();
        removeContact(name);
    }

    public void removeContact(String name) {
        if (phoneContacts.removeContact(name)) {
            System.out.println(name + " removed.");
        } else {
            System.out.println(name + " doesn't exists.");
        }
    }

    public void searchForContactName() {
        String oldName;

        System.out.println("Enter the name of the contact you want to find");
        oldName = inputScanner.nextLine();

        if (phoneContacts.doesContactExist(oldName)) {
            String oldPhoneNumber = phoneContacts.getPhoneNumber(oldName);
            int option = 0;

            System.out.println(oldName + " exists");

            listSearchResultOptions();

            option = inputScanner.nextInt();
            inputScanner.nextLine();
            switch (option) {
                case 1:
                    modifyContactName(oldName);
                    break;
                case 2:
                    modifyContactPhoneNumber(oldName, oldPhoneNumber);
                    break;
                case 3:
                    removeContact(oldName);
                    break;
                default:
                    listSearchResultOptions();
                    break;
            }
        }
    }
}

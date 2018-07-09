package com.hadlak.mobile_phone;

import java.util.Scanner;

public class MobilePhoneApplication {

    private Contacts phoneContacts = new Contacts();
    private Scanner inputScanner = new Scanner(System.in);

    public void startMobilePhoneApplication(){
        boolean quit = false;
        listOptions();
        System.out.println("");
        while (!quit) {
            System.out.println("What do you want to do? Press a number.");
            int option = inputScanner.nextInt();
            inputScanner.nextLine();
            switch(option){
                case 0: listOptions();
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
                    deleteContact();
                    break;
                case 5:
                    findContact();
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
        System.out.println("Your options: \n");
        System.out.println("Press 0: To list the options.");
        System.out.println("Press 1: To print the entire contact list.");
        System.out.println("Press 2: To add a new contact.");
        System.out.println("Press 3: To modify an existing contact.");
        System.out.println("Press 4: To delete a contact.");
        System.out.println("Press 5: To find a contact.");
        System.out.println("Press 9: To quit the application.");
    }

    public void printContactList(){
        phoneContacts.printContacts();
    }

    public void addNewContact(){
        System.out.println("add the name of the new contact: ");
        String name = inputScanner.nextLine();
        System.out.println("add the phone number of the new contact: ");
        String phoneNumber = inputScanner.nextLine();
        phoneContacts.addContact(name, phoneNumber);
    }

    public void modifyContact() {

    }

    public void deleteContact() {

    }

    public void findContact() {

    }
}

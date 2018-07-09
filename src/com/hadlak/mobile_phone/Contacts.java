package com.hadlak.mobile_phone;

import java.util.ArrayList;

public class Contacts extends ArrayList<Contact> {

    public void addContact(String name, String phoneNumber){
        super.add(new Contact(name, phoneNumber));
    }

    public void modifyName(String oldName, String newName){
        int index = getIndexOf(oldName);
        if (index >= 0) {
            this.modifyName(index, newName);
            System.out.println("changed contact name from " + oldName + " to " + newName);
        } else {
            System.out.println(oldName + " does not exist.");
        }
    }

    private void modifyName(int index, String newName){
        super.get(index).setName(newName);
    }

    public void modifyPhoneNumber(String oldName, String newPhoneNumber){
        int index = getIndexOf(oldName);
        if (index >= 0) {
            this.modifyName(index, newPhoneNumber);
            System.out.println("changed phone number for contact: " + oldName + " to " + newPhoneNumber);
        } else {
            System.out.println(oldName + " does not exist.");
        }
    }

    private void modifyPhoneNumber(int index, String newPhoneNumber){
        super.get(index).setPhoneNumber(newPhoneNumber);
    }

    public void removeContact(String name){
        int index = getIndexOf(name);
        if (index >= 0) {
            this.removeContact(index);
            System.out.println("removed contact: " + name);
        } else {
            System.out.println(name + " does not exist.");
        }
    }

    private void removeContact(int index){
        super.remove(index);
    }

    public boolean findContact(String name){
        if (this.getIndexOf(name) == -1) {
            return false;
        } else {
            return true;
        }
    }

    private int getIndexOf(String name) {
        int position = -1;
        for (int i = 0; i < super.size(); i++) {
            Contact contact = super.get(i);
            if (contact.getName() == name) {
                position = i;
                return position;
            }
        }
        return position;
    }

    public void printContacts(){
        for (int i = 0; i < super.size(); i++) {
            Contact thisContact = super.get(i);
            System.out.println("name: " + thisContact.getName() + ", phone: " + thisContact.getPhoneNumber());
        }
    }
}

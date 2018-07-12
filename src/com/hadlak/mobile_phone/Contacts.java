package com.hadlak.mobile_phone;

import java.util.ArrayList;

public class Contacts extends ArrayList<Contact> {

    public void addContact(String name, String phoneNumber){
        super.add(Contact.createContact(name, phoneNumber));
    }

    public boolean modifyName(String oldName, String newName){
        int oldIndex = getIndexOf(oldName);
        if (oldIndex >= 0 && !doesContactExist(newName)) {
                this.modifyName(oldIndex, newName);
                return true;
        } else {
            return false;
        }
    }

    private void modifyName(int index, String newName){
        super.get(index).setName(newName);
    }

    public boolean modifyPhoneNumber(String oldName, String newPhoneNumber){
        int index = getIndexOf(oldName);
        if (index >= 0) {
            this.modifyPhoneNumber(index, newPhoneNumber);
            return true;
        } else {
            return false;
        }
    }

    private void modifyPhoneNumber(int index, String newPhoneNumber){
        super.get(index).setPhoneNumber(newPhoneNumber);
    }

    public boolean removeContact(String name){
        int index = getIndexOf(name);
        if (index >= 0) {
            this.removeContact(index);
            return true;
        } else {
            return false;
        }
    }

    private void removeContact(int index){
        super.remove(index);
    }

    public boolean doesContactExist(String name){
        return(this.getIndexOf(name) != -1);
    }

    private int getIndexOf(String name) {
        int position = -1;
        for (int i = 0; i < super.size(); i++) {
            Contact contact = super.get(i);
            if (contact.getName().equals(name)) {
                position = i;
                return position;
            }
        }
        return position;
    }

    public String getPhoneNumber(String name) {
        int index = getIndexOf(name);
        String phoneNumber = super.get(index).getPhoneNumber();
        return phoneNumber;
    }

    public void printContacts(){
        for (int i = 0; i < super.size(); i++) {
            Contact thisContact = super.get(i);
            System.out.println("name: " + thisContact.getName() + ", phone: " + thisContact.getPhoneNumber());
        }
    }
}

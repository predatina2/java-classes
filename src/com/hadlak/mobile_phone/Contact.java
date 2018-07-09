package com.hadlak.mobile_phone;

import java.util.ArrayList;

public class Contact {

    private String name;
    private String phoneNumer;

    public Contact(String name, String phoneNumer) {
        this.name = name;
        this.phoneNumer = phoneNumer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(String phoneNumer) {
        this.phoneNumer = phoneNumer;
    }
}

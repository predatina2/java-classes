package com.hadlak;

import com.hadlak.pc.Printer;

public class Main {

    static int count = 0;
    static int sum = 0;

    public static void main(String[] args) {

        Printer printer = new Printer("HD 300", 50,true);
        while (!printer.hasEmptyToner()){
            printer.printPage();
        }
        System.out.println("printed " + printer.getPagesPrinted() + " pages");
    }

}

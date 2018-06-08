package com.hadlak.pc;

public class Printer {

    private String name;
    private double tonerLevel;
    private int pagesPrinted = 0;
    private boolean duplex;

    private double tonerLevelToPrint = 0.12d;

    public Printer(String name, double tonerLevel, boolean duplex) {
        this.name = name;
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1d;
        }
        this.duplex = duplex;
        if (duplex) {
            tonerLevelToPrint *= 2; // if you have a duplex printer, your toner needs more ink
        }
    }

    public boolean hasEmptyToner(){
        if (tonerLevel < tonerLevelToPrint ){
            return true;
        } else {
            return false;
        }
    }

    public void fillUpToner(){
        this.tonerLevel = 100;
    }

    public void printPage() {

        if (tonerLevel >= tonerLevelToPrint ){
            tonerLevel -= tonerLevelToPrint;
            pagesPrinted++;
        } else {
            System.out.println("Toner is empty.");
        }
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

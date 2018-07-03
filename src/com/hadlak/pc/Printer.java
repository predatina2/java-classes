package com.hadlak.pc;

public class Printer {

    private String name;
    private boolean duplex;

    private double tonerLevel;
    private int pagesPrinted;
    // add printed pages here and distinguish between pages and paper...

    private double tonerLevelToPrint = 0.12d;

    public Printer(String name, double tonerLevel, boolean duplex) {
        this.name = name;
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1d;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;

        if (this.duplex) {
            System.out.println("Printing in duplex mode");
        }

        /*
        Printer printer = new Printer("HD 300", 50,true);
        while (!printer.hasEmptyToner()){
            printer.printPages(11);
        }
        System.out.println("printed " + printer.getPagesPrinted() + " pages");
        */
    }

    public boolean hasEmptyToner() {
        if (tonerLevel < tonerLevelToPrint) {
            return true;
        } else {
            return false;
        }
    }

    public double addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                //tonerLevel = 100;
                //return tonerLevel;
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesPrinted = 0;
        if (hasEmptyToner()) {
            return -1;
        }
        int count = 1;
        while (!hasEmptyToner() && count <= pages) {
            if (duplex && (count % 2 == 0)) {
                pagesPrinted++; // save paper in duplex mode
            }
            this.tonerLevel -= this.tonerLevelToPrint;
            count++;
        }
        this.pagesPrinted += pagesPrinted;
        System.out.println("printed " + pagesPrinted + " pages");
        return pagesPrinted;
    }

    public void printPages() {
        this.printPages(1);
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

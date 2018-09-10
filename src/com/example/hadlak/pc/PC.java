package com.example.hadlak.pc;

public class PC {

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC() {
        /* default PC */
        this(new Case("220B", "Dell", "240"
                        , new Dimensions(20, 20, 5))
                , new Monitor("27inch Beast", "Acer"
                        , 27, new Resolution(2540, 1440))
                , new Motherboard("BJ-200", "Asus", 4
                        , 6, "v2.44"));

        /*
        monitor.drawPixelAt(1500, 1200, "red");
        motherboard.loadProgram("Windows 1.0");
        theCase.pressPowerButton();
        powerUp();
        */

    }

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }

}

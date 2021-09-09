package com.ahmaddudayef.section7.composition.computer;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButto();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
//        getMonitor().drawPixelAt(1200, 50, "yellow");
        // using getter if we need to do some verification like is object initialized
        // or calling like this
        monitor.drawPixelAt(1200, 50, "yellow");
    }

    public void loadProgram(String programName) {
        motherboard.loadProgramm(programName);
    }
}

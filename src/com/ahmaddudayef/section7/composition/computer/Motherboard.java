package com.ahmaddudayef.section7.composition.computer;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramSlot;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacture, int ramSlot, int cardSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlot = ramSlot;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgramm(String programName) {
        System.out.println("Program " + programName +
                " is now loading..");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}

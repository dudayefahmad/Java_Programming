package com.ahmaddudayef.section7.composition.computer;

public class Monitor {
    private String model;
    private String manufacture;
    private int size;
    private Resolution nativeResulation;

    public Monitor(String model, String manufacture, int size, Resolution nativeResulation) {
        this.model = model;
        this.manufacture = manufacture;
        this.size = size;
        this.nativeResulation = nativeResulation;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ","
                + y +" in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResulation() {
        return nativeResulation;
    }
}

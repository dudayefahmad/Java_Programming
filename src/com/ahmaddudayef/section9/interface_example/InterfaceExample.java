package com.ahmaddudayef.section9.interface_example;

public class InterfaceExample {

    public static void main(String[] args) {
        ITelephone timPhone;
        timPhone = new DeskPhone(123456);
        timPhone.powerOn();
        timPhone.callPhone(123456);
        timPhone.answer();

        timPhone = new MobilePhone(24565);
        timPhone.powerOn();
        timPhone.callPhone(24565);
        timPhone.answer();
    }
}

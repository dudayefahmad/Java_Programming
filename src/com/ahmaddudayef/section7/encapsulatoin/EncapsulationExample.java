package com.ahmaddudayef.section7.encapsulatoin;

public class EncapsulationExample {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullName = "Ahmad";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int demage = 10;
//        player.loseHealth(demage);
//        System.out.println("Remaining health = "
//                + player.healthRemaining());
//
//        demage = 11;
//        player.health = 200;
//        player.loseHealth(demage);
//        System.out.println("Remaining health = "
//                + player.healthRemaining());


        EnhancedPlayer player = new EnhancedPlayer("Dayef", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());

    }
}

package com.ahmaddudayef.section6.constructor_example;

public class AccountExample {

    public static void main(String[] args) {
        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.
//        Account bobAccount = new Account();
        Account bobAccount = new Account("12345", 0.00,
                "Bob Brown",
                "bob@bob.com",
                "08635727367");

        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());
        System.out.println(bobAccount.getCustomerName());
        System.out.println(bobAccount.getCustomerEmailAddress());
        System.out.println(bobAccount.getCustomerPhoneNumber());

        bobAccount.withDrawal(100.0);

        bobAccount.deposit(50.0);
        bobAccount.withDrawal(100.0);

        bobAccount.deposit(51.0);
        bobAccount.withDrawal(100.0);

        Account timAccount = new Account("Tim", "tim@gmail.com", "12323");
        System.out.println(timAccount.getNumber() + " name " + timAccount.getCustomerName());
        System.out.println("Curren ballence is " + timAccount.getBalance());
        timAccount.withDrawal(100.55);

//        VipPerson vipPerson1 = new VipPerson();
//        System.out.println(vipPerson1.getName());
//        System.out.println(vipPerson1.getCreditCard());
//        System.out.println(vipPerson1.getEmail());
//
//        VipPerson vipPerson2 =  new VipPerson("Bob", 25000.0);
//        System.out.println(vipPerson2.getName());
//        System.out.println(vipPerson2.getCreditCard());
//        System.out.println(vipPerson2.getEmail());
//
//        VipPerson vipPerson3 =  new VipPerson("Bob", 25000.0, "bob@gmail.com");
//        System.out.println(vipPerson3.getName());
//        System.out.println(vipPerson3.getCreditCard());
//        System.out.println(vipPerson3.getEmail());
    }
}

package com.ahmaddudayef.section8.autoboxing_unboxing.challenge;

public class BankingApplication {

    public static void main(String[] args) {
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions

        Bank bank = new Bank("Bank Indonesia");

        if(bank.addBranch("Jakarta")) {
            System.out.println("Jakarta Branch created");
        }

        bank.addCustomer("Jakarta", "Ahmad", 100.0);
        bank.addCustomer("Jakarta", "Tom", 50.0);
        bank.addCustomer("Jakarta", "Dandy", 70);

        bank.addBranch("Palembang");
        bank.addCustomer("Palembang", "Rudi", 70.0);

        bank.addCustomerTransaction("Jakarta", "Ahmad", 40.22);
        bank.addCustomerTransaction("Jakarta", "Tom", 20.22);
        bank.addCustomerTransaction("Jakarta", "Ahmad", 70.50);

        bank.listCustomers("Jakarta", true);
        bank.listCustomers("Palembang", true);

        bank.addBranch("Jambi");

        if (!bank.addCustomer("Jambi", "Doni", 5.53)) {
            System.out.println("Error Jambi branch does not exist");
        }

        if (!bank.addBranch("Jakarta")) {
            System.out.println("Jakarta branch already exist");
        }

        if (!bank.addCustomerTransaction("Jakarta", "Boni", 45.76)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Jakarta", "Ahmad", 12.21)) {
            System.out.println("Customer Ahmad already exists");
        }

    }
}

package com.ahsanburney;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("American Bank");

        bank.addBranch("Houston");
        bank.addCustomer("Houston", "bob",50.50);
        bank.addCustomer("Houston", "tim",10.05);
        bank.addCustomer("Houston", "pency",14.04);

        bank.addBranch("Chicago");
        bank.addCustomer("Chicago", "tom",523.50);

        bank.addCustomerTransaction("Houston","bob",44.23);
        bank.addCustomerTransaction("Houston","bob",42.23);
        bank.addCustomerTransaction("Houston","tim",1.23);

        bank.listCustomers("Houston", true);
        bank.listCustomers("Chicago", true);


        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist");
        }

        if(!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if(!bank.addCustomerTransaction("Adelaide", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if(!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }






    }
}

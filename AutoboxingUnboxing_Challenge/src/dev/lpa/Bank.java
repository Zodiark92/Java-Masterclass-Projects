package dev.lpa;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.name = bankName;
        this.customers = new ArrayList<>();
    }

    public boolean addCostumer(String name, double bankAccount) {
        if(getCustomer(name) != null) {
            System.out.println("Customer " + name + " already exists.");
            return false;
        }
        this.customers.add(new Customer(name, bankAccount));
        System.out.println("Customer "  + name + " added");
        return true;
    }

    public boolean addTransaction(double amount, String customerNameFrom, String customerNameTo) {
        Customer customerSource = getCustomer(customerNameFrom);
        Customer customerTarget = getCustomer(customerNameTo);
        if(customerSource != null && customerTarget != null) {
           if(customerSource.addTransaction(-amount, customerNameTo)){
               customerTarget.addTransaction(amount, customerNameFrom);
               System.out.println("Transaction from " + customerNameFrom + " to " + customerNameTo + " of " + amount + " completed");
           }
        }
        System.out.println("CustomerFrom or CustomerTo do not exists.");
        return false;
    }

    public void printCustomerTransaction (String name) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            System.out.println(customer);
        } else {
            System.out.println("Customer " + name + " does not exist.");
        }
    }

    private Customer getCustomer(String name) {
        for(Customer customer : customers) {
            if(customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}

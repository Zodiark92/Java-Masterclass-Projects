package dev.lpa;

import java.util.ArrayList;

public class Customer {

    private String name;
    private Double bankAccount;
    private ArrayList<Transaction> transactions;

    public Customer(String name, double bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.transactions = new ArrayList<>();
    }

    public boolean addTransaction(Double amount, String customerName) {
        if(amount < 0 && bankAccount < -amount) {
            System.out.println("Insufficient founds");
            return false;
        }
        this.bankAccount += amount;
        this.transactions.add(new Transaction(amount, customerName));
        System.out.println("Transaction added");
        return true;
    }

    public Double getBankAccount() {
        return bankAccount;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        String customerDescription = String.format("""
                Customer Name: %s
                Bank Account: %.2f
                Transactions: 
                """, this.name, this.bankAccount);
        for(Transaction transaction : this.transactions) {
           customerDescription = customerDescription.concat("- Amount: " + transaction.getAmount() + " dollars, Customer: " + transaction.getCustomerTo() + "\n");
        }
        return customerDescription;
    }

}

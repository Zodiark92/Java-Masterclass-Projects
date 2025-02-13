package dev.lpa;

public class Transaction {

    private Double amount;
    private String customerTo;

    public Transaction(double amount, String customerTo) {
        this.amount = amount;
        this.customerTo = customerTo;
    }

    public Double getAmount() {
        return amount;
    }

    public String getCustomerTo() {
        return customerTo;
    }
}

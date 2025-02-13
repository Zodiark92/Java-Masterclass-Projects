package dev.lpa;

public class main {

    public static void main(String[] args) {

        Bank intesa = new Bank("Intesa San Paolo");
        intesa.addCostumer("Jhon", 100.0);
        intesa.addCostumer("Tim", 356.28);
      //  intesa.addCostumer("Tim", 3.28);

        intesa.addTransaction(50, "jhon", "tim");
        intesa.addTransaction(20, "jhon", "tim");
        intesa.addTransaction(50, "jhon", "tim");
      //  intesa.addTransaction(200, "tim", "kevin");
        intesa.addTransaction(200, "tim", "jhon");
        intesa.printCustomerTransaction("jhon");
        intesa.printCustomerTransaction("tim");



    }
}

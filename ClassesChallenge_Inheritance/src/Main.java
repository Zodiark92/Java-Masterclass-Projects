public class Main {
    public static void main(String[] args) {

     //   BankAccount firstAccount = new BankAccount("123456", 1000.0, "Tim", "tim@gmail.com", "333-44567789");

        BankAccount firstAccount = new BankAccount();
        System.out.println(firstAccount.getAccountNumber());
        System.out.println(firstAccount.getAccountBalance());

        firstAccount.depositFunds(500);
        firstAccount.withdrawFunds(50);
        firstAccount.withdrawFunds(700);
        firstAccount.depositFunds(100);
        firstAccount.withdrawFunds(550);

        BankAccount timsAccount = new BankAccount("Tim", "tim@gmail.com", "333-5566789");
        System.out.println("Customer name: " + timsAccount.getCustomerName());
        System.out.println("Customer email: " + timsAccount.getEmail());
        System.out.println("Customer phone number: " + timsAccount.getPhoneNumber());
        System.out.println("Account number: " + timsAccount.getAccountNumber());

    }
}
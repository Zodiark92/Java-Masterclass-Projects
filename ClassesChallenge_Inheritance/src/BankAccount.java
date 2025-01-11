public class BankAccount {

    private String accountNumber;

    private double accountBalance;

    private String customerName;

    private String email;

    private String phoneNumber;

    public BankAccount(){
        this("0000",0.0,"default name", "default email", "999999999");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("0000", 0.0, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String accountNumber, double accountBalance, String name, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double amount){
        this.accountBalance += amount;
        System.out.println("You have deposited " + amount);
        System.out.println("New account balance: " + accountBalance);
    }

    public void withdrawFunds(double amount){
        if(this.accountBalance < amount){
            System.out.println("Insufficient funds. Unable to make this withdrawal");
            System.out.println("Account balance: " + this.accountBalance);
            return;
        }
        this.accountBalance -= amount;
        System.out.println("You have withdrawn " + amount);
        System.out.println("New account balance: " + this.accountBalance);
    }
}

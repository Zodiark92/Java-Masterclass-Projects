public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    //It is better to call the constructor with two parameters (if the default value changes, I have to change it in two places)
//    public Customer() {
//        this("Default name", 0.0, "Defaul email");
//    }

    public Customer() {
      this("Default name","Default email");
    }

    public Customer(String name, String email) {
        this(name, 0.0, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}

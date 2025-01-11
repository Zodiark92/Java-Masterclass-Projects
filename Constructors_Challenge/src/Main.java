public class Main {

    public static void main(String[] args) {

        Customer tim = new Customer();
        System.out.println(tim.getName());
        System.out.println(tim.getEmail());
        System.out.println(tim.getCreditLimit());

        Customer bob = new Customer("Bob", "bob@gmail.com");
        System.out.println(bob.getName());
        System.out.println(bob.getEmail());
        System.out.println(bob.getCreditLimit());

        Customer laura = new Customer("Laura", 500.0, "laura@gmail.com");
        System.out.println(laura.getName());
        System.out.println(laura.getEmail());
        System.out.println(laura.getCreditLimit());
    }
}
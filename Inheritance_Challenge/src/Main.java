public class Main {
    public static void main(String[] args) {

    SalariedEmployee salariedWorker =
            new SalariedEmployee("Tim","20/09/1992","20/10/2022", 25500);

    System.out.println("The age of the worker " + salariedWorker.getName() + ": " + salariedWorker.getAge());
    System.out.println("The worker " + salariedWorker.getName() + " with id " + salariedWorker.getEmployeeId() + " collects a pay of " + salariedWorker.collectPay());
    salariedWorker.setEndDate("21/12/2024");
    salariedWorker.retire();
    System.out.println("The worker " + salariedWorker.getName() + " with id " + salariedWorker.getEmployeeId() + " collects a pension pay of " + salariedWorker.collectPay());

    HourlyEmployee hourlyEmployee = new HourlyEmployee("Jimmy", "12/01/1998", "25/08/2024", 25.89);
    System.out.println("The age of the worker " + hourlyEmployee.getName() + ": " + hourlyEmployee.getAge());
    System.out.println("The worker " + hourlyEmployee.getName() + " with id " + hourlyEmployee.getEmployeeId() + " collects a pay of " + hourlyEmployee.collectPay());
    System.out.println("The worker " + hourlyEmployee.getName() + " with id " + hourlyEmployee.getEmployeeId() + " has a total pay of " + hourlyEmployee.getDoublePay());
    }
}
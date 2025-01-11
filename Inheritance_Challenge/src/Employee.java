public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    //CORRECTION
    private static long employeeNumber = 1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate, "undefined");
        this.employeeId = Employee.employeeNumber++;
        this.hireDate = hireDate;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getHireDate() {
        return hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

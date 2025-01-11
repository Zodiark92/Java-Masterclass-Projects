public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String endDate, double hourlyPayRate) {
        super(name, birthDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){ // for example holiday's pay
        return 2 * collectPay();
    }

    @Override
    public double collectPay() {
        return this.hourlyPayRate * 150;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + hourlyPayRate +
                ", name='" + name + '\'' +
                ", endDate='" + endDate + '\'' +
                "} " + super.toString();
    }
}

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    public void retire(){
        System.out.println("The worker " + name + " is retired");
        terminate(endDate);
        this.isRetired = true;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    @Override
    public double collectPay() {
        //CORRECTION
        double payCheck = this.annualSalary/12;
        double correctedPay = (this.isRetired) ? 0.9 * payCheck : payCheck;
        return correctedPay;
    }

    //CORRECTION
//    @Override
//    public String toString() {
//        return "SalariedEmployee{" +
//                "annualSalary=" + annualSalary +
//                ", isRetired=" + isRetired +
//                "} " + super.toString();
//    }
}

public class Worker {
    protected String name;
    private String birthDate;
    protected String endDate;

    //CORRECTION
    public Worker(){

    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge() {
        //  return 30;
        // CORRECTION
        int currentYear = 2024;
        int yearOfBirth = Integer.parseInt(this.birthDate.substring(6)); //formato mm/dd/yyyy
        return (currentYear - yearOfBirth);
    }

    public double collectPay() {
      //  return 1532.89;
        // CORRECTION
        return 0.0;
    }

    public void terminate(String endDate) {
      //  System.out.println("The worker terminates the day " + endDate);
        //CORRECTION like a setter, it's clearer for business logic
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

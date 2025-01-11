public class Car {
    protected String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println(this.description  + " is starting the engine");
        System.out.printf("The car is a %s", this.getClass().getSimpleName() + "\n");
    }

    public void drive(){
        System.out.println("Benefits of driving " + this.description + "\n " +
                "Type of car: " + this.getClass().getSimpleName());
    }

    protected void runEngine(){
        System.out.printf("Running engine of %s... a type of %s%n", this.description, this.getClass().getSimpleName());
    }

    public String getDescription() {
        return description;
    }

    public static Car getCar(String description){

        return switch (description.toLowerCase()) {
            case "fiat" -> new GasPoweredCar("Fiat Panda S", 50, 8, true);
            case "tesla" -> new ElectricCar("Tesla X", 30,8);
            case "toyota" -> new HybridCar("Toyota RAV4", 60, 8, 10);
            default -> {
                System.out.println("Make not found");
                yield null;
            }
        };
    }
}

class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;
    private boolean diesel;

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders, boolean diesel) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.diesel = diesel;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Start to use internal combustion engine...");
        if(this.diesel){
            System.out.println("The gas is compressed by the engine piston to reach high temperature");
        } else {
            System.out.println("the fuel is injected into the combustion chamber and combined with air");
        }
        System.out.println("The mixture is ignited by a spark from the spark plug");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.printf("%s is a type of %s.%n " +
                "this type of car is simple to drive and are more commonly used worldwide.", this.description, this.getClass().getSimpleName());
        System.out.println("Select the gear and go!");
        runEngine();
    }

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Using the battery pack to start the engine.. power on");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving a electric car is easier to drive than a fuel-powered vehicle");
        System.out.println(
                "follow a few easy steps:\n" +
                        "\n" +
                        "Hop in your EV and set up your driving position and mirrors\n" +
                        "\n" +
                        "Press the power button that’s usually placed on the dashboard to turn the car on\n" +
                        "\n" +
                        "Use the gearstick (or the equivalent in your car) to select ‘Drive’");
        System.out.println("Driving an electric car is usually a smoother and quieter experience than driving a petrol or diesel model with an internal combustion engine (ICE)./n" +
                "electric vehicles don’t have gears");
        runEngine();
    }
}

class HybridCar extends Car {
    private double averageKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description, double averageKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.averageKmPerLitre = averageKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Using both fuel engine and electric power...\n" +
                "An hybrid car use gasoline as fuel for the ICE and also have a battery pack and electric motor to assist the engine and provide additional power\n" +
                "the electric motor powers the vehicle on its own for short distances, reducing the reliance on the gasoline engine and improving fuel efficiency");
    }

    @Override
    public void drive() {
        super.drive();
        System.out.println("By integrating an internal combustion engine and an electric motor, hybrid cars optimize fuel use by relying on the electric motor for low-speed and stop-and-go driving");
        runEngine();
    }
}

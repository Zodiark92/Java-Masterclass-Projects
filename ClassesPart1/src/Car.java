public class Car {

    private String color = "blue";
    private String make = "BMW";
    private String model = "Tesla";
    private int doors = 4;
    private boolean convertible = false;

    public String getColor(){
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make){
        if(make == null) {
            this.make = "Unkwnown";
        }

        String lowercaseMake = make.toLowerCase();
        switch(lowercaseMake){
            case "holden", "porche", "bmw" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println("Color: " + color +  ", make: "
                + make + ", model: "
                + model + ", doors: " + doors + " " +
                (convertible ? ", convertible" : ""));
    }
    
}

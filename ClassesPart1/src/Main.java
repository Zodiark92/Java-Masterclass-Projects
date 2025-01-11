public class Main {
    public static void main(String[] args) {

        Car car = new Car();

        System.out.println("Make: " + car.getMake());
        System.out.println("Color: " + car.getColor());

        car.setMake("BMW");
        car.setColor("Blue");
        car.setModel("Panda");
        car.setDoors(4);
        car.setConvertible(false);

        car.describeCar();
        
        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setColor("Red");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setConvertible(false);

        targa.describeCar();
    }
}
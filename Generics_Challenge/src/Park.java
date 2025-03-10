public class Park extends Point {

    public Park(String name, double longitude, double latitude) {
        super(name, longitude, latitude);
        this.description = "Description of the park " + name + "...";
    }

    @Override
    public void description() {
        System.out.println(description);
    }
}

public class River extends Line {

    private String description;

    public River(String name, double[] latitudes, double[] longitudes) {
        super(name, latitudes, longitudes);
        this.description = "Description of the river " + name + "...";
    }

    @Override
    public void description() {
        System.out.println(description);
    }

}

import java.util.Arrays;

public abstract class Line implements Mappable {

    protected String name;
    private double[] latitudes;
    private double[] longitudes;
    protected String description;

    private double[][] coordinates;

    public Line(String name, double[] latitudes, double[] longitudes) {
        this.name = name;
        this.coordinates = new double[latitudes.length][2];
        for(int i = 0; i< latitudes.length; i++) {
            this.coordinates[i][0] = latitudes[i];
            this.coordinates[i][1] = longitudes[i];
        }
    }

    public abstract void description();

    @Override
    public void render() {
        System.out.println("RENDER " + name + " as LINE (" + Arrays.deepToString(coordinates) + ")");
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "Name: " + name + " with coordinates " + Arrays.deepToString(coordinates);
    }
}

public abstract class Point implements Mappable {

    protected String name;
    private double longitude;
    private double latitude;
    protected String description;

    public Point(String name,double longitude, double latitude) {
        this.name = name;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public abstract void description();

    @Override
    public void render() {
        System.out.printf("RENDER %s as POINT ([%f, %f])%n", name, latitude, longitude);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return  "Name: " + name
                + " with coordinates: (" + latitude + ")" + ", (" + longitude + ")";
    }

}

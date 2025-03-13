public class Main {

    public static void main(String[] args) {

        Park yellowstone = new Park("Yellowstone Park", 44.4882, -110.5916);
        yellowstone.setDescription(" Within Yellowstone's 2.2 million acres, visitors have unparalleled opportunities to observe wildlife in an intact ecosystem, explore geothermal areas that contain about half the world’s active geysers, and view geologic wonders like the Grand Canyon of the Yellowstone River.");

        Park grandCanyon = new Park("Grand Canyon", 36.1069, -112.1401);
        grandCanyon.setDescription("The Grand Canyon is a canyon in the U.S. state of Arizona. It is the most popular tourist destination in the United States, with 70 million visitors annually.");

        Park yosemite = new Park("Yosemite", 37.8606, -119.5383);
        yosemite.setDescription("Yosemite National Park is a national park in California, United States, covering an area of 1,059 square miles (2,710 km2) in southern Sierra Nevada.");

        River missisippi = new River("Mississippi", new double[]{47.2160, 35.1556, 29.5166}, new double[]{-95.2348, -90.0659, -89.2495});
        missisippi.setDescription("The Mississippi is a major river in the U.S. state of Missouri, and the second longest river in the United States, after the Colorado River.");

        River colorado = new River("Colorado", new double[]{40.4708, 36.1015, 34.2964}, new double[]{-105.8286, -112.0892, -114.1148});
        colorado.setDescription("The Colorado River is a major river in the U.S. state of Colorado, and the second longest river in the United States, after the Mississippi River.");

        Layer<Park> mapParkLayer = new Layer<>();
        mapParkLayer.addElement(yellowstone);
        mapParkLayer.addElement(grandCanyon);
        mapParkLayer.addElement(yosemite);

        Layer<River> mapRiverLayer = new Layer<>();
        mapRiverLayer.addElement(missisippi);
        mapRiverLayer.addElement(colorado);


        mapParkLayer.renderLayer();
        mapRiverLayer.renderLayer();
    }


}

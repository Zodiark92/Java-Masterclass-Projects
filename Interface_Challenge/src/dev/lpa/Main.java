package dev.lpa;

public class Main {

    public static void main(String[] args) {

        Mappable museum = new Building("Palazzo Chiericati", "Vicenza Museum", "Blue Star", "Museum", "High");
        Mappable river = new UtilityLine("Bacchiglione", "Vicenza River", "Blue Line", "Vicenza River", "Thick");

        museum.toJSON();
        System.out.println("");
        river.toJSON();


    }
}

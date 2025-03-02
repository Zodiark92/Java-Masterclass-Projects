package dev.lpa;

public class UtilityLine extends MappedObject{

    private String name;
    private String utility;
    private String thickness;

    public UtilityLine(String name, String label, String marker, String utility, String thickness) {
        super(GeometryType.LINE, label, marker);
        this.name = name;
        this.utility = utility;
        this.thickness = thickness;
    }

    @Override
    String formatSpecificProperties() {
        return String.format("""
                "name": %s,
                "utility": %s,
                "thickness": %s
                """, name, utility, thickness);
    }

    @Override
    public String label() {
        return label;
    }

    @Override
    public GeometryType type() {
        return type;
    }

    @Override
    public String iconType() {
        return marker;
    }
}

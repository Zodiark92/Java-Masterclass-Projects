package dev.lpa;

public class Building extends MappedObject{

    private String name;
    private String usage;
    private String quality;

    public Building(String name, String label, String marker, String usage, String quality) {
        super(GeometryType.POINT, label, marker);
        this.name = name;
        this.quality = quality;
        this.usage = usage;
    }

    @Override
    String formatSpecificProperties() {
        return String.format("""
                "name": %s,
                "usage": %s,
                "quality": %s
                """, name, usage, quality);
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

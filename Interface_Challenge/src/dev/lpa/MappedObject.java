package dev.lpa;

public abstract class MappedObject implements Mappable {

    protected GeometryType type;
    protected String label;
    protected String marker;

    public MappedObject(GeometryType type, String label, String marker) {
        this.type = type;
        this.label = label;
        this.marker = marker;
    }

    @Override
    public void toJSON() {
        String formattedJSONProperties = formatBaseProperties() + formatSpecificProperties();
        System.out.printf(Mappable.JSON_PROPERTY, formattedJSONProperties);
    }

    abstract String formatSpecificProperties();

    protected String formatBaseProperties(){
        return String.format("""
                "type": %s,
                "label": %s,
                "marker": %s,
                """, type, label, marker);
    }
}

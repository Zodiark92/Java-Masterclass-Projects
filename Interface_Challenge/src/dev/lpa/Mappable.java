package dev.lpa;

enum GeometryType {

    POINT,

    LINE;
}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties":
            {%s}""";


    String label();

    GeometryType type();

    String iconType();

    default void toJSON() {
        System.out.printf(JSON_PROPERTY, "");
    }

    static void printProperties(Mappable instance) {
        System.out.printf(JSON_PROPERTY, "");
    }

}

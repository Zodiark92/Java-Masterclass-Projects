package dev.lpa.model;

public class LPAStudent extends Student{

    private Double percentComplete;

    public LPAStudent() {
        percentComplete = random.nextDouble(0, 100.01);
    }

    @Override
    public String toString() {
        return "%s %8.1f%%".formatted(super.toString(), percentComplete);
    }

    public double getPercentComplete() {
        return percentComplete;
    }

    public int compareByPercentComplete(LPAStudent other) {
        return percentComplete.compareTo(other.percentComplete);
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        if(fieldName.equalsIgnoreCase("PERCENT_COMPLETE")) {
            Double d = Double.parseDouble(value);
            return percentComplete <= d;
        }
        return super.matchFieldValue(fieldName, value);
    }

}

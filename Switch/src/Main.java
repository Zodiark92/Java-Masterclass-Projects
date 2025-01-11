public class Main {

    public static void main(String[] args) {

        int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3,4 or 5");
                System.out.println("The value was " + switchValue);
            default:
                System.out.println("Value was not 1,2, 3, 4 or 5");
                break;
        }

        //Enhanced switch statement
        int value = 3;

        switch(value){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was 3");
                System.out.println("Value: " + value);
            }
            default -> System.out.println("Value was not 1,2, 3, 4 or 5");
        }

        String month = "OCTOBER";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month){


        return switch (month) {
            case "JANAURY", "FEBRUARY", "MARCH" -> {
                {
                    yield "1st";
                }
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }
}

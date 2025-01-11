public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(3615));
        System.out.println(getDurationString(65, 145));
    }

    public static String getDurationString(int seconds){

        if(seconds < 0)
            return "Invalid value for seconds";


        int minutes = seconds/60;
        int hours =  minutes/60;

        int remainingSeconds = seconds % 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h ";

        return hoursString + getDurationString(remainingMinutes,remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds){

        if((minutes < 0) || seconds < 0 || seconds > 59)
            return "Invalid value";

        String minutesString = minutes + "m ";
        String secondString = seconds + "s";

        return minutesString + secondString;
    }
}

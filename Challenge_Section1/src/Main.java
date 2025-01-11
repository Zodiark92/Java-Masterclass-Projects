public class Main {

    public static void main(String[] args) {

       double firstValue = 20.0;
       double secondValue = 80.0;

       double thirdValue = (firstValue + secondValue) * 100.0;

       double reminder = thirdValue % 40.0;

       boolean isReminderZero = reminder == 0;

       System.out.println("isReminderZero: " + isReminderZero);

       if(!isReminderZero){
           System.out.println("Got some reminder");
       }

    }

}

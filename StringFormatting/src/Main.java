public class Main {
    public static void main(String[] args) {

        String bulletIn = "Print a bulleted list: \n" +
                "\t\u2022 First Point \n" +
                "\t\t\u2022 Sub Point";

        System.out.println(bulletIn);

        String textBlock = """
                Print a bulleted list: 
                    \u2022 First Point 
                      \u2022 Sub Point
                """;

        System.out.println(textBlock);

        int age = 32;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        int number = 43;
        System.out.printf("Your number is %.2f %n", (float)number);

        for(int i=1; i <= 100000; i *= 10){
            System.out.printf("Printing %6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
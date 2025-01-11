public class Main {

    public static void main(String... args) {

    System.out.println("Hello world");

    String[] stringSplitted = "Hello world again".split(" ");
    printText(stringSplitted);

    System.out.println("*********");
    printText("Hello");

        System.out.println("*********");
        printText("Hello", "World", "again");

    }

    private static void printText(String... textList) {

        for(String text : textList) {
            System.out.println(text);
        }
    }
}
public class Main {

    public static void main(String[] args) {

        printInformation("Hello world");
        printInformation("");
        printInformation("\t   \n");
      //  printInformation(null);

        String helloWorld = "Hello World";
        System.out.printf("Index of r: %d %n", helloWorld.indexOf('r'));
        System.out.printf("Index of World: %d %n", helloWorld.indexOf("World"));

        System.out.printf("Index of l: %d %n", helloWorld.indexOf('l',3));
        System.out.printf("Last index of l: %d %n", helloWorld.lastIndexOf("l", 8));

        System.out.printf("Last index of k: %d %n", helloWorld.lastIndexOf("k")); // -1 char or string not found

        String helloWorldLowercase = helloWorld.toLowerCase();

        if(helloWorld.equals(helloWorldLowercase)){
            System.out.println("The two strings are equal");
        }

        if(helloWorld.equalsIgnoreCase(helloWorldLowercase)){
            System.out.println("The two strings are equal ignoring the case");
        }

        if(helloWorld.startsWith("Hello")){
            System.out.println("The string starts with Hello");
        }

        if(helloWorld.endsWith("World")){
            System.out.println("The string ends with World");
        }

        if (helloWorld.contains("World")){
            System.out.println("The string contains World");
        }

        if(helloWorld.contentEquals("Hello World")){
            System.out.println("The two strings match");
        }


    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length: %d %n", length);

        if(string.isEmpty()){
            System.out.println("The string is empty");
            return;
        }

        if(string.isBlank()){
            System.out.println("The string is blank");
        }

        System.out.printf("First char: %c %n", string.charAt(0));
        System.out.printf("Last char: %c %n", string.charAt(string.length() - 1));

    }
}
public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "21/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Starting index: " + startingIndex);
        System.out.println("Birth year: " + birthDate.substring(startingIndex));

        System.out.println("Month: " + birthDate.substring(3,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("new date: " + newDate);

        //less efficient using concat (every time a string is created)
        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println("new date using concat: " + newDate);

        newDate = "25" + "/" + "11" + "/" +  "1982"; //java recognizes that it's only a string

        newDate = "25".concat("/").concat("11").concat("/").concat("1982"); // also in this case wa have a new strin every time

        System.out.println(newDate.replace("/", "-"));
        System.out.println(newDate.replace("2","00"));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

        System.out.println("ABC\n".repeat(3));
        System.out.println("-".repeat(20));

        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));

        System.out.println("        ABC\n".repeat(3).indent(-4));
        System.out.println("-".repeat(20));
    }
}

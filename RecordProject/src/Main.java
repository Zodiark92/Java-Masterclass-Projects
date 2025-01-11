public class Main {

    public static void main(String[] args) {

        for (int i = 0; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S992300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Tom";
                        case 3 -> "Carol";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    }, "10/03/1992", "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("39006", "Ann", "10/03/1992","Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("39007","Richard","10/12/2001", "Java Masterclass");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

    }
}
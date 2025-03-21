package dev.lpa.model;

import dev.lpa.util.QueryItem;

import java.util.Random;

public class Student implements QueryItem, Comparable<Student> {

    private static int INDEX = 0;

    private String name;
    private String course;
    private Integer yearStarted;
    private Integer studentId;

    protected static Random random = new Random();

    private static String[] firstNames = {"Ann", "Bill", "Tom", "Cathy", "Jon", "Robert", "James", "Harry"};
    private static String[] courses = {"C++", "Java", "Python", "PHP", "Javascript", "Spring", "Angular"};

    public Student() {
        int lastNameIndex = random.nextInt(65, 91);
        name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
        course = courses[random.nextInt(4)];
        yearStarted = random.nextInt(2018, 2023);
        Student.INDEX++;
        studentId = Student.INDEX;
    }

    @Override
    public String toString() {
        return "%n%d %-15s %-15s %d".formatted(studentId,name, course, yearStarted);
    }

    public int getYearStarted() {
        return yearStarted;
    }

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        String fName = fieldName.toUpperCase();
        return switch(fName) {
            case "NAME" -> name.equalsIgnoreCase(value);
            case "COURSE" -> course.equalsIgnoreCase(value);
            case "YEARSTARTED" -> yearStarted == Integer.parseInt(value);
            default -> false;
        };
    }

    public int compareByYear(Student other) {
        return yearStarted.compareTo(other.yearStarted);
    }

    @Override
    public int compareTo(Student o) {
        return studentId.compareTo(o.studentId);
    }
}

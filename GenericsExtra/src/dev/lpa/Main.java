package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryItem;
import dev.lpa.util.QueryList;

import java.util.ArrayList;
import java.util.List;

record Employee(String name) implements QueryItem {

    @Override
    public boolean matchFieldValue(String fieldName, String value) {
        return false;
    }
}

public class Main {

    public static void main(String[] args) {

        int studentsCount = 10;
        List<Student> students = new ArrayList<>();

        for(int i = 0; i< studentsCount; i++) {
            students.add(new Student());
        }

        students.add(new LPAStudent());
        printMoreLists(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();

        for(int i = 0; i< studentsCount; i++) {
            lpaStudents.add(new LPAStudent());
        }

      //  lpaStudents.set(0, new Student());
      //  students.set(0, new LPAStudent());
     //   lpaStudents.add(new Student());

        printMoreLists(lpaStudents);

        List<String> stringList = new ArrayList<>(List.of("Charlie", "Debby", "Tim"));
        List<Integer> intList = new ArrayList<>(List.of(1,2,3));

        testList(stringList);
        testList(intList);

        System.out.println("*".repeat(30));

        var queryList = new QueryList<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreLists(matches);

        var students2021 = QueryList.<Student>getMatches(new ArrayList<>(), "yearStarted", "2021");
        printMoreLists(students2021);

      //  QueryList<Employee> employees = new QueryList<>(); employee not within its bound
    }


    public static void printMoreLists(List<? extends Student> students) {

        //the compiler doesn't know if the list is a list of Student or a subtype -> compiler error
//            Student lastStudent = students.get(students.size() - 1);
//            students.set(0, lastStudent);

        //or
//            students.add(new Student());

        for(var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }

    public static <T extends Student> void printList(List<T> students) {

        for(var student : students) {
            System.out.println(student.getYearStarted() + ": " + student);
        }
        System.out.println();
    }


    //TYPE ERASURE
//    public static void testList(List<String> list) {
//
//        for(var element : list) {
//            System.out.println("String: " + element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//
//        for(var element : list) {
//            System.out.println("Integer: " + element.doubleValue());
//        }
//    }

    public static void testList(List<?> list) {

        for(var element : list) {
            if(element instanceof String s) {
                System.out.println(s.toUpperCase());
            } else if(element instanceof Integer i) {
                System.out.println(i.doubleValue());
            }
        }

    }
}

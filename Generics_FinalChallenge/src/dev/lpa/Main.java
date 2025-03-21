package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;
import dev.lpa.util.QueryItem;
import dev.lpa.util.QueryList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int studentsCount = 25;
        List<LPAStudent> students = new ArrayList<>();

        for(int i = 0; i< studentsCount; i++) {
            students.add(new LPAStudent());
        }

        QueryList<LPAStudent> queryStudents = new QueryList<>();
        for(var student : students) {
            if(student.matchFieldValue("PERCENT_COMPLETE", "50.0")) {
                queryStudents.add(student);
            }
        }

        System.out.println("Students: \n" + students);

        System.out.println("*".repeat(30));

        queryStudents.sort(Comparator.naturalOrder());

        System.out.println("*".repeat(30));
        System.out.println("Student Order ID: ");
        queryStudents.sort(new IDComparator());
        System.out.println("QueryStudents: \n" + queryStudents);

        System.out.println("*".repeat(30));
        System.out.println("Student Order Percent Complete:: ");
        queryStudents.sort(new PercentCompleteComparator());
        System.out.println("QueryStudents: \n" + queryStudents);

        System.out.println("*".repeat(30));
        System.out.println("Student Order Year: ");
        queryStudents.sort(new YearComparator());
        System.out.println("QueryStudents: \n" + queryStudents);

    }

}

class IDComparator implements Comparator<LPAStudent> {

    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return o1.compareTo(o2);
    }
}

class PercentCompleteComparator implements Comparator<LPAStudent> {

    //with percent complete
    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return o1.compareByPercentComplete(o2);
    }

}

class YearComparator implements Comparator<LPAStudent> {

    //with year order
    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return o1.compareByYear(o2);
    }
}




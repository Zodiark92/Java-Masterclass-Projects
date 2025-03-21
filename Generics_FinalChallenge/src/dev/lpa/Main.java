package dev.lpa;

import dev.lpa.model.LPAStudent;
import dev.lpa.model.Student;

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

        List<Student> queryStudents = new ArrayList<>();
        for(var student : students) {
            if(student.matchFieldValue("PERCENT_COMPLETE", "50.0")) {
                queryStudents.add(student);
            }
        }

        System.out.println("Students: \n" + students);

        System.out.println("*".repeat(30));

        queryStudents.sort(Comparator.naturalOrder());



        StudentComparator comparator = new  StudentComparator();
        LPAStudent[] lpaStudents = (LPAStudent[]) Arrays.copyOf(queryStudents.toArray(), queryStudents.size());

        Arrays.sort(lpaStudents, comparator);
        System.out.println("QueryStudents: \n" + lpaStudents);


    }

}

class StudentComparator implements Comparator<LPAStudent> {

    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return o1.compareTo(o2);
    }
}

package dev.lpa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Employee (String firstName, String lastName, int hireDate) {
}

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Anna", "Bredberg", 2015),
                new Employee("Tom", "Billim", 2010),
                new Employee("Annabelle", "Luxuri", 2022),
                new Employee("Kevin", "Redfield", 2013),
                new Employee("Tim", "Bulton", 2024)
        ));

        printEmployees(employees, "name");
        System.out.println("******************");
        printEmployees(employees, "year");

    }

    private static void printEmployees(List<Employee> employees, String sort) {

        class EmployeeFullInformation{

            private String fullName;
            private Integer yearsWorked;

            private EmployeeFullInformation (Employee employee) {
                this.fullName = employee.firstName() + " " + employee.lastName();
                this.yearsWorked = LocalDate.now().getYear() - employee.hireDate();
            }

            @Override
            public String toString() {
                return "Employee: \n" +
                        "fullName= " + fullName + "\n" +
                        "yearsWorked= " + yearsWorked +
                        "\n";
            }
        }

        List<EmployeeFullInformation> listEmployees = new ArrayList<>();
        for(var employee : employees) {
            listEmployees.add(new EmployeeFullInformation(employee));
        }

        var comparator = new Comparator<EmployeeFullInformation>() {
            @Override
            public int compare(EmployeeFullInformation o1, EmployeeFullInformation o2) {
                if(sort.equalsIgnoreCase("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked.compareTo(o2.yearsWorked);
            }
        };

        listEmployees.sort(comparator);
        for(var employee : listEmployees) {
            System.out.println(employee);
        }
    }
}

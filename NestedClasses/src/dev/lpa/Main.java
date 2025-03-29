package dev.lpa;

import dev.lpa.domain.Employee;
import dev.lpa.domain.StoreEmployee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<> (List.of(
                new Employee(10001, "Ralph", 2015),
                new Employee(10005, "Carol", 2021),
                new Employee(10022, "Jane", 2022),
                new Employee(13151, "Laura", 2020),
                new Employee(10050, "Jim", 2021)
                ));

//        var comparator = new EmployeeComparator<>();
//        employees.sort(comparator);

        //STATIC INNER CLASS
        employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());

        for(var emp : employees) {
            System.out.println(emp);
        }

        System.out.println("Store Members");
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
                new StoreEmployee(10015, "Meg", 2019, "Target"),
                new StoreEmployee(10015, "Joe", 2021, "Walmart"),
                new StoreEmployee(10105, "Tom", 2020, "Macys"),
                new StoreEmployee(10215, "Marty", 2018, "Walmart"),
                new StoreEmployee(10322, "Bud", 2016, "Target")
        ));

//        var comparator = new Employee.EmployeeComparator<>();
//        storeEmployees.sort(comparator);

        //INNER CLASS
        var genericEmployee = new StoreEmployee();
        var comparator = genericEmployee.new StoreComparator<>();

        storeEmployees.sort(comparator);

        for(var emp : storeEmployees) {
            System.out.println(emp);
        }

    }
}

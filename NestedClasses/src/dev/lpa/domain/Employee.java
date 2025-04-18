package dev.lpa.domain;

import java.util.Comparator;

public class Employee {

    private String name;
    private int employeeId;
    private int yearStarted;

    public static class EmployeeComparator <T extends Employee> implements Comparator<Employee> {

        private String sortType;

        public EmployeeComparator() {
            this("name");
        }

        public EmployeeComparator(String sortType) {
            this.sortType = sortType;
        }

        @Override
        public int compare(Employee o1, Employee o2) {
            if(sortType.equalsIgnoreCase("yearStarted")) {
                return (o1.yearStarted - o2.yearStarted);
            }
            return o1.getName().compareTo(o2.getName());
        }
    }

    public Employee() {
    }

    public Employee( int employeeId, String name, int yearStarted) {
        this.name = name;
        this.employeeId = employeeId;
        this.yearStarted = yearStarted;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%d %-8s %d".formatted(employeeId, name, yearStarted);
    }
}

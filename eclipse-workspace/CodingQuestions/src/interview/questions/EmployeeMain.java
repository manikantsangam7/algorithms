package interview.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        // Inserting sample employee data
        employeeList.add(new Employee("Alice", 30, 12000.0));
        employeeList.add(new Employee("Bob", 28, 9500.0));
        employeeList.add(new Employee("Charlie", 35, 15000.0));
        employeeList.add(new Employee("David", 25, 8000.0));
        
        

        // Filter employees with salary > 10,000 and sort in descending order
		employeeList.stream().filter(e -> e.getSalary() > 10000)
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				.map(e->e.getName())
				.collect(Collectors.toList());
	}
}

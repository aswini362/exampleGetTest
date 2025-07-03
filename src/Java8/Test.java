package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "Finance", 80000),
                new Employee("Eve", "IT", 75000),
                new Employee("Frank", "Finance", 72000)
        );

        Map<String, Optional<Employee>> maxSalaryByDept = employees.stream().collect(Collectors.groupingBy(employee -> employee.department, Collectors.maxBy(Comparator.comparingInt(emp -> emp.salary))));
        maxSalaryByDept.forEach((dept, emp) ->
                System.out.println("Department: " + dept + ", Max Salary Employee: " + emp.orElse(null))
        );
        Map<String, List<Employee>> employeesByDept = employees.stream().collect(Collectors.groupingBy(emp -> emp.department));
        employeesByDept.forEach((dept, empList) -> {
            System.out.println("Department: " + dept);
            empList.forEach(e -> System.out.println("  - " + e));
        });
        //counting each depatrment
        Map<String, Long> collect = employees.stream().collect(Collectors.groupingBy(emp -> emp.department, Collectors.counting()));
        System.out.println(collect);

        Bike bike=new Bike();
        bike.start();;
        bike.stop();
        bike.honk();
        Vechile.maintanice();

        /*public String getInsuranceName(Person person) {
            return Optional.ofNullable(person)
                    .map(Person::getCar)
                    .map(Car::getInsurance)
                    .map(Insurance::getName)
                    .orElse("Unknown");
        }*/

        OwnFunctionalInterface ownFunctionalInterface=input -> input.toUpperCase();

        String helloWorld = ownFunctionalInterface.process("Hello world");
        System.out.println(helloWorld);
    }


}

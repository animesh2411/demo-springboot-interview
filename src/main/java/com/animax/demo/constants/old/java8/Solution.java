package com.animax.demo.constants.old.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
 
/*
Given List<Employee>,
  1.use streams,functional interfaces, and lambda to print out unique Car brands all employee have
  2.use streams,functional interfaces, and lambda to print out highest salary, average salary
 
 
*/

class Solution {
    public static void main(String[] args) {

        List<Employee> empList = Employee.getEmployeeList();
        //your code here
        List<String> distinctCars = empList.stream().flatMap(employee -> employee.getCars().stream()).distinct().toList();
        System.out.println(distinctCars);

        // 1st way
        Employee maxSalaryEmployee = empList.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElse(null);
        System.out.println(maxSalaryEmployee.getName() + ":" + maxSalaryEmployee.getSalary());

        //2nd way
        double maxSalary = empList.stream().mapToDouble(Employee::getSalary)
                .max().orElse(0.0);
        System.out.println(maxSalary);

        double avgSalary = empList.stream().mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
        System.out.println(avgSalary);

    }
}

class Employee {


    private long id;
    private String name;
    private List<String> cars;
    private double salary;
    public Employee(long id, String name, List<String> cars, double salary) {
        this.id = id;
        this.name = name;
        this.cars = cars;
        this.salary = salary;
    }

    public static List<Employee> getEmployeeList() {
        List<Employee> list = Arrays.asList(new Employee(1, "A", Arrays.asList("Hyundai", "Kia", "Maruti"), 1000),
                new Employee(2, "B", Arrays.asList("Jeep", "Honda", "Maruti"), 2000),
                new Employee(3, "C", Arrays.asList("Honda", "Tata", "Nissan"), 2000));

        return list;

    }

    ;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCars() {
        return cars;
    }

    public void setCars(List<String> cars) {
        this.cars = cars;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
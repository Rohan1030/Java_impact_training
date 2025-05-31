package day25;
import java.util.*;
class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000; 
    }
}
class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing the team");
    }

    void addEmployee() {
        System.out.println("Adding a new employee to the team");
    }

    @Override
    double getSalary() {
        return 70000; 
    }
}
class inheritance2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work(); 
        System.out.println("Employee Salary: " + emp.getSalary());

        HRManager hr = new HRManager();
        hr.work(); 
        hr.addEmployee(); 
        System.out.println("HR Manager Salary: " + hr.getSalary());
    }
}
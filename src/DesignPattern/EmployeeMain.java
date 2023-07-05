package DesignPattern;

public class EmployeeMain {
    public static void main(String[] args) {
       Employee employee= EmployeeFactory.getEmployee("web developer");
        System.out.println(employee.getSalary());


        Employee employee1=EmployeeFactory.getEmployee("android developer");
        System.out.println(employee1.getSalary());
    }
}

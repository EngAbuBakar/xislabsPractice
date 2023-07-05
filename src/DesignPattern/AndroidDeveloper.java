package DesignPattern;

public class AndroidDeveloper implements Employee{


    @Override
    public int getSalary() {
        System.out.println("getting Android developer salary");
        return 30000;
    }
}

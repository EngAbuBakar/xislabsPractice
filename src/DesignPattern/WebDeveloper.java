package DesignPattern;

public class WebDeveloper implements Employee{


    @Override
    public int getSalary() {

        System.out.println("getting Web developer salary");
        return 40000;
    }
}

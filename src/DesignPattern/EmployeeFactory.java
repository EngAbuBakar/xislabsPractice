package DesignPattern;

public class EmployeeFactory {
    //getting Employee
    public static Employee getEmployee(String empType){
        if (empType.trim().equalsIgnoreCase("Android developer")){
            return new AndroidDeveloper();
        }
        else if(empType.trim().equalsIgnoreCase("Web developer")){
            return new WebDeveloper();
        }
        else{
        return null;
        }
    }
}

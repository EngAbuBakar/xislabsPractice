package ExeptionExample;

public class ThrowExample {
    public static void validateAge(int age)
    {
        if (age<18)
        {
            throw new IllegalArgumentException("age must be greater than 18");

        }
    }
    public static void main(String[] args) {
        try {
        int age=14;
       validateAge(age);
        System.out.println("age is valid");
        }catch (IllegalArgumentException illegalArgumentException)
        {
            System.out.println("Invalid age: "+illegalArgumentException.getMessage());
        }
    }

}

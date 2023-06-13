package ExeptionExample;

public class ThrowsExample {
    public static double divide(int num1,int num2) throws ArithmeticException
    {
        if (num2==0)
        {
            throw new ArithmeticException("Divider must be greater than zero");
        }
        return num1/num2;
    }

    public static void main(String[] args) {
        try {
            System.out.println( divide(3,2));
        }catch (ArithmeticException arithmeticException)
        {
            System.out.println("Error "+arithmeticException.getMessage());
        }

    }
}

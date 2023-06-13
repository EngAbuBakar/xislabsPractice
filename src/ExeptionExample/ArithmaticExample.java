package ExeptionExample;

public class ArithmaticExample {
    public static void main(String[] args) {
       try {
           int a = 22, b = 0, c;
           c = a / b;
           System.out.println(c);
       }catch (ArithmeticException arithmeticException){
           System.out.println(arithmeticException.getMessage());
       }
       finally {
           System.out.println("this is running from the finally block");
       }
    }
}

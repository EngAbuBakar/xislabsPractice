package ExeptionExample;

public class ArithmaticExample {
    public static void main(String[] args) {
        ArithmaticExample arithmaticExample=new ArithmaticExample();

       try {
           arithmaticExample.divideSomeThing(23,2);
       }catch (ArithmeticException arithmeticException){
           System.out.println(arithmeticException);
       }
       finally {
           //System.out.println("this is running from the finally block");
       }
    }
    public boolean  divideSomeThing(int a, int b)
    {
       try {
           return false;
       }catch (ArithmeticException arithmeticException)
       {
           System.out.println(arithmeticException.getMessage());
       }
       finally {
          // System.out.println("finally block");
           return true;
       }

    }
}

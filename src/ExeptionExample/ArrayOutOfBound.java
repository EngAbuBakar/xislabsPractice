package ExeptionExample;

public class ArrayOutOfBound {
    public static void main(String[] args) {
       try {

        int rangeOfNumbers[]={2,1,3,4};
        int length=rangeOfNumbers.length;
        for (int i=1;i<10;i++)
        {
            System.out.println(rangeOfNumbers[i]);
        }
       }catch (Exception exception)
       {
           System.out.println(exception);

       }

       finally {
           System.out.println("finally");
       }
    }
}

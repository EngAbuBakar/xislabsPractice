package ProblemPrctice;

public class ReverseString {
    public static void main(String[] args) {
   // reverseString("Hello world!");
       // int number=reverseNumber(5435);
        //System.out.println(number);
    ///reverseNumber(2324);
    }

    public static String reverseString(String name) {
        //  String name="abu bakar";
        String nstr = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            nstr = nstr + name.charAt(i);
        }
        System.out.println(nstr);
        return null;


    }
    public  static int reverseNumber(int num){
       int revNum=0;
       int rem=0;
       while (num!=0){
          rem=num%10;
          revNum=revNum*10+rem;
          num=num/10;
       }
        return revNum;
    }
}

package ExeptionExample;

public class StringOutOfBound {
    public static void main(String[] args) {
       try {
        String names="Ali is veru mice guy";
        int size=names.length();
        names.replace("veru", "very");
           System.out.println(names);
        System.out.println(names.charAt(23));
    }catch (Exception exception)
       {
           System.out.println(exception.getMessage());
       }
       finally {
           System.out.println("finall block");
       }


       String gifts[]={"Chocolate","Candies","Sweet"};
       try {

           for (String gift: gifts) {
               if (gift=="Candies")
                   gift.replace("Candies","Cookies");
               System.out.println(gift);
           }

       }catch (Exception exception){
           System.out.println(exception);
       }
       finally {
           System.out.println("finally block without exception");
       }
    }

}

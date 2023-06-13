package ExeptionExample;

public class NullPointerExample {
    public static void main(String[] args) {
       try {
        int temperature[]=null;
        int size=temperature.length;
        System.out.println("the size of the array is:  "+size);
       }catch (NullPointerException e){
           System.out.println(e.getMessage());
       }
    }
}

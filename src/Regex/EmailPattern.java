package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       do {
           System.out.println("Enter your email");
           String email = scanner.nextLine();
           if (isEmailValidate(email)) {
               System.out.println("Valid email");
               break;
           } else {
               System.out.println("Invalid email");
           }
       }while (true);
    }

    public static boolean isEmailValidate(String email)
    {
        String regex="^[A-Za-z0-9+_.-]+@[A-Za-z]+$";
        return Pattern.matches(regex, email);
    }

}

package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetacharacterPattern {
    public static void main(String[] args) {
        //for specific character matching
//        String myTaxt="Welcome Abu Bakar learning Java";
//        Pattern pattern= Pattern.compile("Welcome.");
//        Matcher matcher=pattern.matcher(myTaxt);
//        while (matcher.find())
//        {
//            System.out.println(" "+myTaxt.substring(matcher.start(),matcher.end()));
//        }


        //for digits matching
//        String myTaxt="aABC231";
//        Pattern pattern= Pattern.compile("[a-zA-Z]+[0-9]\\w+\\d");
//        Matcher matcher=pattern.matcher(myTaxt);
//        while (matcher.find())
//        {
//            System.out.println(" "+myTaxt.substring(matcher.start(),matcher.end()));
//        }


        //matching fix length in a string like mobile number length
        String myTaxt="03017865434";
        Pattern pattern= Pattern.compile("\\d{11}");
        Matcher matcher=pattern.matcher(myTaxt);
        if (matcher.matches())
        {
            System.out.println("Valid phone number");
        }
        else
        {
            System.out.println("Invalid ");
        }
    }
}

package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("Abu Bakar");
        Matcher matcher=pattern.matcher("Abu Bakar");
        //boolean b=matcher.matches();
        if (matcher.matches())
        {
            System.out.println("Pattern is matched successfully");
        }
        else
            System.out.println("Invalid");
    }



}

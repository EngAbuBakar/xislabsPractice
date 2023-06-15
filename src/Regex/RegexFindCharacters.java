package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindCharacters {
    public static void main(String[] args) {
        String myTaxt="AbuBakar learning Java";
        Pattern pattern= Pattern.compile("[a-z]+");
        Matcher matcher=pattern.matcher(myTaxt);

       while (matcher.find())
       {
           System.out.println(" "+myTaxt.substring(matcher.start(),matcher.end()));
           System.out.println(matcher.start());
           System.out.println(matcher.end());
       }

    }
}

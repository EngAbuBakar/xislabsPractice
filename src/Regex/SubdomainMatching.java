package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubdomainMatching {
    public static void main(String[] args) {
        String url="https://www.subdomain.com";
        String subdomain=subdomainValidate(url);
        System.out.println("Subdomain is: "+subdomain);
        int arr[]={2,3,4,5,6};
        for (int i=0; i<=arr.length;i++){
            int sum= arr[i]+arr[i+1];
            if (sum==7)
            {

                System.out.println(""+arr[i]+"+"+arr[i+1]+" ="+sum);
                break;

            }
            else {
                System.out.println("else");
            }
        }
    }

    public static String subdomainValidate( String url)
    {
        String subdomain="";
        String regex="https?://([a-zA-Z-0-9-]+)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(url);
        if (matcher.find())
        {
            subdomain =matcher.group(0);
        }
        return subdomain;
    }
}

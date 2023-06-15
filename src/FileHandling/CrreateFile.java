package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CrreateFile {
    public static void main(String[] args) {
       try {
           File myfile = new File("abc1.txt");
           System.out.println("path"+myfile.getAbsolutePath());
           if (myfile.createNewFile())
           {
               System.out.println("the file is"+myfile.getName());
           }
           else {
//               System.out.println(myfile.canWrite());
//               FileWriter fileWrite=new FileWriter(myfile);
//               fileWrite.write("This is the string written by fileWrite method");
//
//               fileWrite.write("NEW");
//               fileWrite.close();
//               System.out.println("successfully written");
               Scanner scanner=new Scanner(myfile);
               while (scanner.hasNextLine())
               {
                   String text=scanner.nextLine();
                   System.out.println(text);
               }
               myfile.delete();
               System.out.println("deleted"+myfile.getName());
               scanner.close();
               System.out.println( myfile.length());

           }

       }catch (Exception exception)
       {
           System.out.println("error occurred");
           System.out.println(exception);
       }
    }
}

package ExeptionExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("d:/study.txt");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
        }
    }
}

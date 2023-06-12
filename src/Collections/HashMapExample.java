package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer>  students=new HashMap();
        students.put("Arslan",23);
        students.put("Akbar",23);
        students.put("Ajmal",23);
        //students.put("Arslan",56);
        students.replace("Arslan",12);
        //We can add key as NULL or value also can  be null and zero
        students.put(null,0);

        System.out.println(students.entrySet());
        System.out.println(students.keySet());

        for (Map.Entry map: students.entrySet()) {
            System.out.println("Student Name is :"+map.getKey()+" Roll No. "+map.getValue());
        }
    }
}

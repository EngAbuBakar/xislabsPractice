package Collections;

import java.util.Vector;

public class VectorClassExample {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Shahveer");
        vector.add(1,"Sameer");
        vector.addElement("Abu Bakar");
        System.out.println("Initial Capacity is: "+vector.capacity());
        System.out.println("The element at index 1: "+vector.elementAt(1));
        System.out.println(vector);
        for (String vec: vector) {
            if (vec.equals("Sameer"))
                break;
            System.out.println(vec);
        }


    }
}

package Collections;

import javax.swing.event.ListDataEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>();
        myList.add("JUMA");
        myList.add("Saturday");
        myList.add("Sunday");

        ListIterator itr=myList.listIterator(1);

        System.out.println(itr.previous());
        System.out.println(itr.previousIndex());
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

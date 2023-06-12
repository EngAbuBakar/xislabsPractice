package Collections;

import java.util.ArrayList;
import java.util.*;

public class LInkedListExample {
    public static void main(String[] args) {
        List<Integer> lInkedLists=new ArrayList<>();
        lInkedLists.add(32);
        lInkedLists.add(43);
        lInkedLists.add(55);

        List<Integer>list=new ArrayList<>();
        list.addAll(lInkedLists);

        System.out.println(lInkedLists.size());
        list.add(2,80);
        System.out.println(list);
        System.out.println(list.size());
      //  Iterator<Integer> iterator= lInkedLists.iterator();
/*
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
       // System.out.println(lInkedLists.get(1));
        System.out.println("Out put with for each loop");
        for (Integer list: lInkedLists) {
            if (list.equals(23)){
                continue;
            }
            System.out.println(list);

          }*/


    }
}


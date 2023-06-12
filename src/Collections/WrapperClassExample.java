package Collections;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {
    public static void main(String[] args) {
       /* List<int> list=new ArrayList<>();
        List<double> list=new ArrayList<>();
        List<float> list=new ArrayList<>();
        */
        List<Integer> list=new ArrayList<>();

       list.add(32);
       list.add(32);
       list.add(2);
       // System.out.println(list.stream().count());
        System.out.println(list.stream().findFirst());



    }
}

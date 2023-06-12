package StreamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamObjects {
    public static void main(String[] args) {
        /*empty Steam object
        Stream<Objects>emptyStream=Stream.empty();
        emptyStream.forEach(e->{
            System.out.println(e);
        });
         */
        String names[]={"Abubakar","Jameel","Uzair" };
        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->
        {
            System.out.println(e);
        });
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(55);
        list.add(23);
        list.add(39);
        Stream<Integer> stream2=list.stream();
        stream2.forEach(e->
        {
            System.out.println(e);
        }
        );

    }
}

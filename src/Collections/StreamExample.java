package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
       List<Integer> evenList= numbers.stream().filter(number->number%2==0 || number>2).collect(Collectors.toList());
        System.out.println(evenList);


    }
}

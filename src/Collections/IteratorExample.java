package Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {

                List<Integer> numbers = new ArrayList();
                numbers.add(12);
                numbers.add(83);
                numbers.add(34);
                numbers.add(2);
                numbers.add(23);
                Iterator<Integer> it = numbers.iterator();
                while(it.hasNext()) {
                    Integer num = it.next();
                    if(num < 10) {
                        it.remove();
                    }
                }
                System.out.println(numbers);
            }


}
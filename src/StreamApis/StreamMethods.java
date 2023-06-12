package StreamApis;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        //This is an immutable list
        List<String> cities=List.of("Lahore","Islamabad","Karachi");
        //error will occure
        //cities.add("Faisalabad");

        List<String> newNames = cities.stream().filter(city -> city.startsWith("I")).collect(Collectors.toList());
        System.out.println(newNames);
       //map
        List<Integer> squareOfNum=List.of(23,4,3,1,4);
        List<Integer> newNums = squareOfNum.stream().map(number -> number * number).collect(Collectors.toList());
//       newNums.stream().forEach(number->
//       {
//           System.out.println("Square root of "+number);
//       });
      // sorted
       newNums.stream().sorted().forEach(System.out::println);
    }
}

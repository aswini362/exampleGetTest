package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EachGroupOfLenght {

    public static void main(String [] args){
        List<String> list = List.of("Dog", "Zebra", "Cat", "Cow", "Buffalo", "Lion", "goat", "monkey");

         list.stream().collect(Collectors.groupingBy(String::length))
                .entrySet().stream().forEach(entry->
                         System.out.println(entry.getKey()+" "+entry.getValue().size()  +" "   +entry.getValue()));


        List<String> listOfString = List.of("Charlie", "Alice", "Bob", "Dave");
        List<String> sortString = listOfString.stream().sorted(String::compareTo).collect(Collectors.toList());
        System.out.println(sortString);

        List<Integer> numbers = Arrays.asList(3, 8, 1, 6, 4, 7, 2, 5, 9, 0);

        //FIND all even number

        List<Integer> collect = numbers.stream().filter(x -> x % 2 == 0).sorted().collect(Collectors.toList());
       System.out.println(collect);

        List<Integer> number = Arrays.asList(123, 145, 234, 256, 312, 399, 478);

        Map<Integer, List<Integer>> groupedByFirstDigit = number.stream()
                .collect(Collectors.groupingBy(num -> Integer.parseInt(num.toString().substring(0, 1))));

        groupedByFirstDigit.forEach((key, value) ->
                System.out.println(key + " => " + value));
    }
}

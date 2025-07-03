package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class GivenAnArrayOfintegersgroupthenumbersbytherange {

    public static void main(String [] args){
        int arr[]={2,3,13,15,43,56,42,58,17};

        Map<Integer, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x / 10 * 10, Collectors.toList()));
        System.out.println(collect);

        String[] str={"124","ABC","321","CBX"};
        List<Integer> collect1 = Arrays.stream(str).filter(x -> x.matches("[0-9]+")).map(Integer::valueOf).collect(Collectors.toList());
        System.out.println(collect1);

        //sum of given an array
        int sum = Arrays.stream(arr).boxed().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        //group with aplphptic order

        List<String> words = Arrays.asList("apple", "act", "banana", "bat", "cat", "car", "dog", "ant");

        Map<Character, List<String>> grouped = words.stream().collect(Collectors.groupingBy(word -> word.charAt(0), TreeMap::new, Collectors.toList()));
        grouped.forEach((letter, list) -> System.out.println(letter + ": " + list));
    }
}

package Java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachOccurrenceGivenString {

    public static void main(String [] args){
        String str="OPENTEXT";
        Map<Character, Long> characterCount = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));

        System.out.println(characterCount);

    }
}

package collections;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfElement {

    public static Map<String,Long> countFrequencyElement(List<String> strings){
        Map<String, Long> countFrequencyOfElement = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return countFrequencyOfElement;
    }

    public static void main(String[] args){
        Map<String, Long> countFrequencyElement = countFrequencyElement(List.of("A", "A", "B", "B", "C", "C", "D"));
        System.out.println(countFrequencyElement);
    }

}

package collections;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxValueInTheString {

    public static void findMaximumValueOfString(List<String> list){
        Optional<String> max = list.stream().max(Comparator.naturalOrder());
        max.ifPresent(System.out::println);
    }
    public static void main(String[] args){
        findMaximumValueOfString(List.of("12","43","32","78"));
    }
}

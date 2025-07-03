package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTop3FrequentWords {

    public static void main(String[] args){
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple", "kiwi");
        Map<String, Long> freqWord = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(freqWord);
        List<String> strings = freqWord.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue(Collections.reverseOrder())).limit(3).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(strings);
    }
}

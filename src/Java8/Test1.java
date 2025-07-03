package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        A obj = new B();


        A.Show();
        B.show();

        List<String> hashtags = Arrays.asList("#fun", "#tech", "#code", "#code", "#fun", "#tech", "#fun");

        String result = hashtags.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue(Comparator.reverseOrder()))
                .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

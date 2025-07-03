package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Findthewordthathasthesecondhighestlength {

    public static void main(String [] args){
        String str="i am learing stram api java";
        int n=2;
        String s = Arrays.stream(str.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(n-1).findFirst().orElse(null);
        System.out.println(s);

        // occurance of each word
        Map<String, Long> collect = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}

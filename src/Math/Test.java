package Math;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String [] args){
        int arr []={4,3,2,7,8,2,3,1};


        List<Integer> collect = Arrays.stream(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() >= 2).map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}

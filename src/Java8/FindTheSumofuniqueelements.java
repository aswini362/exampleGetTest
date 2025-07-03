package Java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSumofuniqueelements {
    public static void main(String[] args){
        int [] arr={1,6,7,8,1,6,6,7,8};
        int sum = Arrays.stream(arr).distinct().sum();
        System.out.println(sum);

        //find fine non repateing character in stirng

        String str="Hello World";
        String s = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
      System.out.println(s);
    }
}

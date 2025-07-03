package Java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueElementOnGiveString {
    public static void main(String[] args){
        String str="iFollowMilindMehta";

        Character character = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                        Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

        System.out.println(character);
    }
}

package collections;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {

    public static Map<String,Integer> addConvertListToMap(List<String> stringList){
        Map<String, Integer> map = stringList.stream().collect(Collectors.toMap(s -> s, String::length));
        return map;
    }

    public static Map<Character, String> replacementExstingElement(List<String> list) {
        Map<Character, String> collect = list.stream().collect(Collectors.toMap(
                s -> s.charAt(0),
                s -> s, (existing, replacement) -> existing + ", " + replacement));
        return collect;
    }

    public static void main(String[] args){
        Map<String, Integer> map = addConvertListToMap(List.of("ABC", "DEF", "FGH", "THD", "YETE", "YEUW"));
        System.out.println(map);
        System.out.println("-------------------------------");
        Map<Character, String> characterStringMap = replacementExstingElement(List.of("ABC", "DEF", "FGH", "THD", "YETE", "YEUW", "AVC", "DGF"));
        System.out.println(characterStringMap);
    }
}

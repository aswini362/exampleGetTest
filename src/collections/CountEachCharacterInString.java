package collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachCharacterInString {
    public static void main(String[] args){
        String input="Hello hello 123";
        Map<Character,Integer> map=new LinkedHashMap<>();
        String cleanUpString=input.trim().replaceAll(" +", " ");
        char[] chars = cleanUpString.toCharArray();
        for(Character c:chars){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer cnt = map.get(c);
                map.put(c,cnt+1);
            }
        }
        System.out.println(map);

        LinkedHashMap<Character,Long> countEachWord=cleanUpString.chars().mapToObj(c->(char) c).filter(c->c !=' ' && !Character.isDigit(c))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(countEachWord);
    }
}

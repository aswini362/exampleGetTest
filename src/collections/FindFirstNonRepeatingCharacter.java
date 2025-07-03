package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args){

        String input="AABCBDFB";

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                Integer count = map.get(c);
                map.put(c,count+1);
            }
        }
        System.out.println(map);

        //print find first non repting character
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }

        //write this on java 8

        LinkedHashMap<Character, Long> frequencyMap = input.chars().mapToObj(c -> (char) c).filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(frequencyMap);

        Optional<Character> first = frequencyMap.entrySet().stream().filter(value -> value.getValue() == 1).map(Map.Entry::getKey).findFirst();
         System.out.println(first.get());
    }

}

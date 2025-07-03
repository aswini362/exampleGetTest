package String;

import java.util.LinkedHashMap;
import java.util.Map;

public class TargetCounterpartEachOccurrence {

    public static void main(String[] args) {
        String input = "OPENTEXT";
        char target='T';
        if(input.indexOf(target)==-1){
            System.out.println("Error: target character not found in input.");
            return;
        }
        Map<Character, Integer> occurrenceMap = new LinkedHashMap<>();
        StringBuilder result=new StringBuilder();
        for (char ch : input.toCharArray()) {
            if(ch==target){
                int count = occurrenceMap.getOrDefault(ch, 0) + 1;
                occurrenceMap.put(ch,count);
                result.append(count);
            }else{
                result.append(ch);
            }
        }
        System.out.print(result);
    }



}
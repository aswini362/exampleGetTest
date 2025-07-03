package String;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String [] args) {
        String str="abbac";
        Map<Character,Integer> map= new LinkedHashMap<>();
        int lengthOfSubString=0;
        String subString = null;
        char[] ch = str.toCharArray();

        for(int i=0;i<str.length();i++){
            char ch1 = ch[i];
            if(!map.containsKey(ch1)){
                map.put(ch1,i);
            }else{
                i = map.get(ch1);
                map.clear();
            }
           if(map.size()>lengthOfSubString){
               lengthOfSubString=map.size();
               subString = map.keySet().toString();
           }
        }
        System.out.println(lengthOfSubString);
        System.out.println(subString);
    }
}

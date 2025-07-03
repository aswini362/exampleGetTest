package String;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveduplicateStringGiveCharacter {

    public static void main(String[] args) {
        String input = "programming";
        System.out.println(removeDuplicate(input)); // Output: progamin
    }
    public static String removeDuplicate(String str){
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new LinkedHashSet<>();

        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character character:set){
            sb.append(character);
        }
        return sb.toString();
    }

}

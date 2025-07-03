package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class RemoveDuplicateCharacterInSting {

    public static void main(String [] args){
       /*// first apporach
        String removeCharacter="Java";
        String removeCharacterLowerCase = removeCharacter.toLowerCase();

       StringBuilder stringBuilder=new StringBuilder();
        removeCharacterLowerCase.chars()
                .distinct()
                .forEach(ch -> stringBuilder.append((char) ch));
        System.out.print(stringBuilder);
*/
        //second approach

        String inputString="Java";
        StringBuilder sb=new StringBuilder();
        Set<Character> characterSet=new LinkedHashSet<>();
        for(int i=0;i<inputString.length();i++){
            characterSet.add(inputString.charAt(i));
        }

        for(Character character:characterSet){
            sb.append(character);
        }
        System.out.println(sb);
    }
}

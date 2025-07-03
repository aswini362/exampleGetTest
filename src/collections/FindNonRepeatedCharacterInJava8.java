package collections;

import java.util.Collections;
import java.util.List;

public class FindNonRepeatedCharacterInJava8 {

    public static String findNonRepeatedNonCharacter(List<String> nonRepeatedCharacter){
        String nonChar = nonRepeatedCharacter.stream().filter(ch -> Collections.frequency(nonRepeatedCharacter, ch) == 1).findFirst().orElse(null);
        return nonChar;
    }
    public static void main(String[] args){
        String nonRepeatedNonCharacter = findNonRepeatedNonCharacter(List.of("A", "B", "A", "B", "B", "C"));
        System.out.println(nonRepeatedNonCharacter);
    }
}

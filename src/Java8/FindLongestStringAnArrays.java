package Java8;

import java.util.Arrays;
import java.util.List;

public class FindLongestStringAnArrays {
    public static void main(String [] args){
        List<String> string = Arrays.asList("Aspini", "Aspini", "Aspini", "Aspini","ASPINIM");
        String longestString = string.stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
       System.out.println(longestString);
    }
}

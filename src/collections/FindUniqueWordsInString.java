package collections;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindUniqueWordsInString {

    public static void main(String[] args){
        String uniqueString="Java java tr tr YES no yes No";

        List<String> collect = Arrays.stream(uniqueString.split(" ")).map(String::toUpperCase).sorted().distinct().collect(Collectors.toList());
        System.out.println(collect);
    }
}

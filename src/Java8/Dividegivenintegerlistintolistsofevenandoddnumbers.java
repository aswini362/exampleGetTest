package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dividegivenintegerlistintolistsofevenandoddnumbers {
    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7,8,9};

        List<List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0)).entrySet().stream().map(x -> x.getValue()).collect(Collectors.toList());
        System.out.println(collect);

        //occuracne of each word

        String str="Missippie";
        Set<Map.Entry<Character, Long>> entries = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
        System.out.println(entries);
    }
}

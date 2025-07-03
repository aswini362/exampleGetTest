package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class FindNthHighestSalary {
    public static void main(String[] args) {
        //findNthSalary();

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);

        Map.Entry<Integer, List<String>> integerListEntry = map2.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1);
        System.out.println(integerListEntry);



    }


}

package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test6 {
    public static void main(String[] args){
        int[] input = {1, 2, 11, 21, 31, 42, 56, 23, 16};
        List<String> collect = Arrays.stream(input).boxed().map(String::valueOf)
                .filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect);


        //find nth salary given

        Map<String, Integer> map = new HashMap<>();
        map.put("anil", 1000);
        map.put("ankit", 1200);
        map.put("bhavna", 1200);
        map.put("james", 1200);
        map.put("micael", 1000);
        map.put("tom", 1300);
        map.put("daniel", 1300);
       int n=1;
        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet().stream().
                collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).collect(Collectors.toList()).get(1-n);

        System.out.println(integerListEntry);

      String findHighestLength="i am learing java";

        String max =Arrays.stream(findHighestLength.split(" ")).max(Comparator.comparing(String::length)).get();
       System.out.println(max);
       String removeDuplicateCharacter="abbaabcc";
       removeDuplicateCharacter.chars().mapToObj(c->(char)c).distinct().forEach(System.out::println);

       String printSecondHighstLength="i am learing java Strams";
        String s = Arrays.stream(printSecondHighstLength.split(" ")).sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
       System.out.println(s);

        Integer lenth = Arrays.stream(printSecondHighstLength.split(" ")).map(String::length).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(lenth);

        Map<String, Long> count = Arrays.stream(printSecondHighstLength.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(count);

       // print vowels

        Arrays.stream(printSecondHighstLength.split(" ")).filter(x->x.replaceAll("[voe]"," ").length()==2);

        //grouping even or odd number

        int [] arr={1,2,3,4,5,6,7,8,9,0};

        List<List<Integer>> collect1 = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x % 2 == 0)).entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
         System.out.println(collect1);

         //find first non repating character given string

        String inputString="Hello world";

        String s1 = Arrays.stream(inputString.split(" ")).filter(c -> s.indexOf(c) == s.lastIndexOf(c)).findFirst().get();
        System.out.println(s1);

        //given integer grouping

        int [] arr1={2,3,4,10,11,14,17,21,23,26,27,31,33,45,41,71,81,86};

        List<Integer> collect2 = Arrays.stream(arr1).boxed().collect(Collectors.toList());

        System.out.println(collect2);
        LinkedHashMap<Integer, List<Integer>> collect3 = collect2.stream().collect(Collectors.groupingBy(num -> num / 10 * 10, LinkedHashMap::new, Collectors.toList()));
        System.out.println(collect3);

        // Arrays.strams(arr).fileter(x->x.matches("[0-9]+]").

        //group of anagrams

        List<String> words = Arrays.asList("bat", "tab", "tap", "pat", "cat", "act");

        Map<String, List<String>> collect4 = words.stream().collect(Collectors.groupingBy(word -> {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }));

        Collection<List<String>> values = collect4.values();
       System.out.println(values);

       // moves all the zeros at beginig

        int [] zeros={0,1,4,0,1,0,1};
        List<Integer> collect5 = Arrays.stream(zeros).boxed().collect(Collectors.toList());
        System.out.println(collect5);
        //zeros filters
        List<Integer> zero = collect5.stream().filter(x -> x == 0).collect(Collectors.toList());
        List<Integer> Nonzero = collect5.stream().filter(x -> x != 0).collect(Collectors.toList());
        List<Integer> finalAdd=new ArrayList<>();
        finalAdd.addAll(zero);
        finalAdd.addAll(Nonzero);
        System.out.println(finalAdd);

        Map<Boolean, List<Integer>> partitioned = collect5.stream()
                .collect(Collectors.partitioningBy(x -> x != 0));
        List<Integer> collect7 = partitioned.values().stream().flatMap(x -> x.stream()).collect(Collectors.toList());

       System.out.println(collect7);
    }
}

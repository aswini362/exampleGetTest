package collections;

import java.util.List;

public class FindLongestStringInList {

    public static String findLongestUniqueString(List<String> list) {
        int maxLength = list.stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);

        List<String> longest = list.stream()
                .filter(s -> s.length() == maxLength)
                .distinct()
                .toList();

        return longest.size() == 1 ? longest.get(0) : "zero";
    }

    public static void main(String[] args){
        String longestUniqueString = findLongestUniqueString(List.of("apple","banana", "apple", "mango", "Grape"));
        System.out.println(longestUniqueString);
    }
}

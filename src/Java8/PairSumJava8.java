package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class PairSumJava8 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 2, 4, 5, 6, 7);
        int target = 7;

        Set<String> uniquePairs = new HashSet<>();

        Set<Integer> seen = new HashSet<>();

        numbers.stream()
                .forEach(num -> {
                    int complement = target - num;
                    if (seen.contains(complement)) {
                        // Sort the pair to avoid duplicates like (2,5) and (5,2)
                        int min = Math.min(num, complement);
                        int max = Math.max(num, complement);
                        uniquePairs.add(min + "," + max);
                    }
                    seen.add(num);
                });

        // Print the pairs
        uniquePairs.forEach(pair -> {
            String[] split = pair.split(",");
            System.out.println("(" + split[0] + ", " + split[1] + ")");
        });
    }
}

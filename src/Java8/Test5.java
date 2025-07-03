package Java8;

import java.util.Arrays;
import java.util.Comparator;

public class Test5 {
    public static void main(String [] args){
        int[] arr={1,3,45,2,34,92,54};

        Integer secondHigest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
        System.out.println(secondHigest);
    }
}

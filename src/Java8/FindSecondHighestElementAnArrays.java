package Java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestElementAnArrays {

    public static void main(String [] args){
        int [] nums={63,73,12,4,5,1,98};
        Integer secondHigest = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);

        System.out.println(secondHigest);
    }
}

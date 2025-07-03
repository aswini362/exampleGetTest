package Java8;

import java.util.Arrays;
import java.util.Comparator;

public class GivenASentencefindthewordthathasthehighestlength {

    public static void main(String [] args){
        String str="I am Learing Java";
        String input = Arrays.stream(str.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(input);
    }
}

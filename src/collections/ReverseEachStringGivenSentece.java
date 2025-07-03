package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ReverseEachStringGivenSentece {

    public static void main(String[] args){
        /*String input = "java code";
        String[] word = input.split(" ");
        for(String words:word){
            String rev=" ";
            String reversEachWord ="";
            for(int i=words.length()-1;i>=0;i--){
                reversEachWord=reversEachWord+words.charAt(i);
            }
            rev=rev+reversEachWord;
            System.out.print(rev);
        }*/
        String inputString="Java Code".toLowerCase();
        //split into the String []
        String[] splitString = inputString.split(" ");
        String revString = Arrays.stream(splitString).map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        //System.out.println(revString);

        //with hash map
        Map<String,String> rev=new HashMap<>();
        for(String word:splitString){
            String revWord=new StringBuilder(word).reverse().toString();
            rev.put(word,revWord);
        }
        Collection<String> values = rev.values();
        values.stream().forEach(System.out::print);
    }
    // java 8 feature


}

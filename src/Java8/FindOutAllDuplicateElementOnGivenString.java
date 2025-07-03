package Java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOutAllDuplicateElementOnGivenString {

    public static void main(String[] args){
        String str="Hello World";
        List<Character> collect = str.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).
                map(Map.Entry::getKey).collect(Collectors.toList());
        ;
        System.out.println(collect);

        String revrseWord = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(revrseWord);
       System.out.println(repaceMentTargetValue("OEPNTEXT",'T'));

       String word="Hello";
        Set<Character> set=new LinkedHashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            set.add(ch);
        }
        for(Character c:set){
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
        System.out.println(sortingString("ACDB"));
    }

    // INPUT -> OPENTEXT OUT PUT OPEN1EX2

    public static String repaceMentTargetValue(String str,Character c){
        int count=0;
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==c){
                 count++;
                 stringBuffer.append(count);
            }else{
                stringBuffer.append(ch);
            }

        }
        return stringBuffer.toString();
    }

    //ACBD -->ABCD
    public static String sortingString(String str){
        char[] charArray = str.toCharArray();
        for(int i=0;i<str.length();i++){
           for(int j=i+1;j<str.length();j++){
               if(charArray[i]>charArray[j]){
                   char temp=charArray[i];
                   charArray[i]=charArray[j];
                   charArray[j]=temp;
               }
           }
        }
        return new String(charArray);
    }
   //Java Program To Find First Non Repeated Character Not Using Java 8


}

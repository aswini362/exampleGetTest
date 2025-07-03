package Java8;

import java.util.*;
import java.util.stream.Collectors;

public class WordToCharacter {
    public static void main(String [] args){
        List<String> wordList = Arrays.asList("Aspini", "Kumar", "Mohanty");
        List<Character> character = wordList.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c)).collect(Collectors.toList());
       System.out.println(character);

        List<String> listOfString = List.of("Charlie", "Alice", "Bob", "Dave");

        listOfString.stream().sorted(String::compareTo).collect(Collectors.toList());


       // reverse string

        String str="hello";
        //java 8
        String reversedSorted = str.chars()
                .mapToObj(c -> (char) c)
                .sorted(Collections.reverseOrder()) // <- using reverse order comparator
                .map(String::valueOf)
                .collect(Collectors.joining());
        //System.out.println(reversedSorted);
        for(int i=str.length()-1;i>=0;i--){
            char[] charArray = str.toCharArray();
           // System.out.print(charArray[i]);
        }
        
        
        // reverse only vowels 
        
        String vowels="hello world";
        char[] chars = vowels.toCharArray();
        int left=0;
        int right=vowels.length()-1;

        String vowelsCharter = "AEIOUaeiou";

        while(left<right){
            while (left<right && vowelsCharter.indexOf(chars[left])==-1){
                left++;
            }
            while (left<right && vowelsCharter.indexOf(chars[right])==-1){
                right--;
            }
            int temp=chars[left];
            chars[left]=chars[right];
            chars[right]= (char) temp;
            left++;
            right--;
        }
        //System.out.println(new String(chars));

        String input="Java code";
        String[] words = input.split(" ");
        for(String word:words){
            String reverseWord=" ";
            for(int i=word.length()-1;i>=0;i--){
                char c = word.charAt(i);
                reverseWord=reverseWord+c;
            }
          //  System.out.print(reverseWord);
        }
        
        String eachCharacterCount="hello";
        Map<Character,Integer> map=new LinkedHashMap<>();
        char[] charArray = eachCharacterCount.toCharArray();
        for(Character ch:charArray){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                Integer count = map.get(ch);
                map.put(ch,count+1);
            }
        }
        for(Map.Entry<Character,Integer> maps:map.entrySet()){
            if(maps.getValue()==1) {
                System.out.println(maps.getKey());
                break;
            }
        }
        System.out.println(map);

        // sorting

        int arr[]={23,45,21,56,12,43};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int num:arr) {
            System.out.print(" " +num);
        }
    }
}

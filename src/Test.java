import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        //separate odd number and even numbers

        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        List<Integer> oddNumber = collect.get(false);
        System.out.println("Print odd number"+oddNumber);

        List<Integer> evenNumber = collect.get(true);
        System.out.println("Print even number"+evenNumber);


        // remove duplicate elements from a list using Java 8 streams

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> removeDuplicate = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(removeDuplicate);

        //How do you find frequency of each character in a string using Java 8 streams
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> characterLongMap = inputString.chars().mapToObj(c -> (char) c).filter(c->c!=' ').
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(characterLongMap);
        //How do you find frequency of each element in an array or a list?
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> stationeryCountMap  = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stationeryCountMap );

        //How do you sort the given list of decimals in reverse order?
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
         decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfInteger.stream().filter(x->x%5==0).forEach(System.out::println);
        //Given a list of integers, find maximum and minimum of those numbers?
        List<Integer> integers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer maximum = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println(maximum);

        Integer minmum = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(minmum);

        int [] arr={45, 12, 56, 15, 24, 75, 31, 89};

        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
       System.out.println(max+" "+min);
        //How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};
        List<Integer> collect1 = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(" sorted"+ collect1);

        int m = a.length;
        int n = b.length;

        int[] merged=new int[m+n];
        for(int i=0;i<m;i++){
            merged[i]=a[i];
        }
        for(int i=0;i<n;i++){
            merged[m+i]=b[i];
        }
        Arrays.sort(merged);
        System.out.println(Arrays.toString(merged));

        //Java 8 program to check if two strings are anagrams or not?

        String s1 = "RaceCar";
        String s2 = "CarRace";
        String upperCase = s1.toUpperCase();
        String upperCase1 = s2.toUpperCase();
        char[] charArray = upperCase.toCharArray();
        char[] charArray1 = upperCase1.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        boolean isAnagram = Arrays.equals(charArray,charArray1);
        System.out.println(isAnagram);

        List<String> words = Arrays.asList("bat", "tab", "tap", "pat", "cat", "act");

        Map<String, List<String>> collect4 = words.stream().collect(Collectors.groupingBy(word -> {
            char[] charArray2 = word.toCharArray();
            Arrays.sort(charArray2);
            return new String(charArray2);
        }));

        Collection<List<String>> values = collect4.values();
        System.out.println(values);

        //Given a list of strings, sort them according to increasing order of their length?

        List<String> sortedString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> strings = sortedString.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(strings);

        //17) How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(list2::contains).collect(Collectors.toList()).forEach(System.out::println);

        //Reverse each word of a string using Java 8 streams?
        String str = "Java Concept Of The Day";
        String reverseString = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverseString);
        //Reverse an integer array
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();
        System.out.println(Arrays.toString(reversedArray));

        List<String> listOfString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCountMap = listOfString.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> mostFrequentElement = elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most Frequent Element : "+mostFrequentElement.getKey());
        System.out.println("Count : "+mostFrequentElement.getValue());
        //Given a list of strings, find out those strings which start with a number?
        List<String> listfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listfStrings.stream().filter(str1->Character.isDigit(str1.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);


    }

}

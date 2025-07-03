package Practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


public class June30 {
    public static void main(String[] args){
        List<String> gropingString = List.of("Dog", "Zebra", "Cat", "Cow", "Buffalo", "Lion", "goat", "monkey");
        Map<Integer, List<String>> gropingOfElment = gropingString.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(gropingOfElment);
        //Reverse Each word
        String revreseEachWord="java code text number";
        String reverseWord = Arrays.stream(revreseEachWord.split(" ")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(reverseWord);

        //print group of anagrams
        List<String> words = Arrays.asList("bat", "tab", "cat", "act", "tac", "dog");

        Map<String, List<String>> groupOfAnagrams = words.stream().collect(Collectors.groupingBy(str -> {
                    char[] charArray = str.toCharArray();
                    Arrays.sort(charArray);
                    return new String(charArray);
                }
        ));
        Collection<List<String>> values = groupOfAnagrams.values();
        System.out.println(values);

        //Find the Frequency of Each Character in a String (Ignore Spaces & Case)
        String string="Java Developer".toLowerCase();

        Map<Character, Long> characterLongMap = string.chars().mapToObj(c -> (char) c).filter(c -> c != ' ').collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
       System.out.println(characterLongMap);

       //Find Duplicate Elements in a List

        List<Integer> list = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> seen=new HashSet<>();
        Set<Integer> collect = list.stream().filter(num -> !seen.add(num)).collect(Collectors.toSet());
       System.out.println(collect);

       //Convert Upper Case
        List<String> names = Arrays.asList("Tom", "Jerry", "Spike");
        List<String> strings = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(strings);


        //sort 1s 2s 0s

        int[] nums={2,0,2,1,1,0};
        int high=nums.length-1;
        int low=0;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low++,mid++);
            } else if (nums[mid]==1) {
                mid++;
            }else{
                swap(nums,mid++,high--);
            }
        }

        for(int num:nums){
            System.out.print(" "+num);
        }
        System.out.println("-----------");

        int[] maxKadine={-2,1,-3,4,-1,2,1,-5,4};
        int maxSoFar=maxKadine[0];
        int currentMax=maxKadine[0];
        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        System.out.println(maxSoFar);

        //  find the duplicates

       int[] nums1= {1,3,4,2,2};
       Set<Integer> set=new HashSet<>();
       for(int num:nums1){
           if(set.contains(num)){
               int num1 = num;
               System.out.println(num1);
           }else{
               set.add(num);
           }
       }

       //re arrange postive and negative numbers
       int[] no={3,1,-2,-5,2,-4};
       rearrangeNumber(no);
        for(int num:no){
            System.out.print(" "+num);
        }
    }
    public static void swap(int []nums,int low,int high){
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }

    public static int[] rearrangeNumber(int [] nums){
        int n=nums.length;
        int[] results=new int[n];
        int postIndex=0;
        int negtiveIndex=1;
        for(int num:nums){
            if(num>0){
                results[postIndex]=num;
                postIndex+=2;
            }else{
                results[negtiveIndex]=num;
                negtiveIndex+=2;
            }
        }

        return results;

    }

    public static  int  stockPrice(int [] prices){
        int minPrice=Integer.MIN_VALUE;
        int maxProfit=0;
        for(int price:prices){
            if(minPrice<price){
                minPrice=price;
            }else {
                maxProfit=Math.max(maxProfit,price-minPrice);
            }
        }

        return maxProfit;
    }

    public void maxCountOne(int [] nums){
        int count=0;
        int maxCount=0;
        for(int num:nums){
            if(num==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }else{
                count=0;
            }
        }
    }
}

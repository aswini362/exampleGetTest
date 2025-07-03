package collections;

import java.util.HashMap;
import java.util.Map;

public class CountOccuranceOfGivenCharacter {

    public static void main(String [] args){
        String str="Programming";
        Character target='g';
        //int count = countCharacter(str, target);
        int count = countUsingMap(str, target);
        System.out.print("Count "+count);

    }
    public static int countCharacter(String str,Character target){
        int count=0;
        for(Character c:str.toCharArray()){
            if(c==target){
                count++;
            }
        }
        return count;
    }

    public static int countUsingMap(String str,Character target){
        Map<Character,Integer> count=new HashMap<>();
        for(Character c:str.toCharArray()){
         count.put(c,count.getOrDefault(c,0)+1);
        }
        return count.getOrDefault(target,0);
    }

    public static int countWithTwoPointer(String str,Character c){
        int right=0;
        int count=0;
        int left=str.length()-1;
        while (left<=right){
            if (str.charAt(left) == c) {
                count++;
            }
            if(left!=right && str.charAt(right)==1){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}

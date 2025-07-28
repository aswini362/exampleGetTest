package DSA.Arrays;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3};
        List<Integer> list = removeDuplicatesElement(nums);
        list.stream().forEach(System.out::println);
        System.out.println("-------------- ");

        int k = removeDuplicateElements(nums);
        System.out.print("Array after removing duplicates: ");
        for(int i=0;i<k;i++){
            System.out.print(" "+nums[i]);
        }
        System.out.println("      ");

        System.out.println("Size of unique elements "+k);
    }

    public static List<Integer> removeDuplicatesElement(int [] arr){
        Set<Integer> uniequiesElement=new LinkedHashSet<>();
        for(int num: arr){
            uniequiesElement.add(num);
        }
        List<Integer> list=new ArrayList<>(uniequiesElement);
        return list;
    }


    public static int removeDuplicateElements(int [] nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }

        }
        return i+1;
    }
}

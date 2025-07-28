package DSA.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> missing = findMissingNumbers(nums);
        System.out.println(missing);
        List<Integer> allDisappredNumbers = findAllDisappredNumbers(nums);
        System.out.println(allDisappredNumbers);
    }


    public static List<Integer> findMissingNumbers(int [] nums){
        List<Integer> result=new ArrayList<>();
        for (int i=1;i<=nums.length;i++){
            boolean isFound=false;
            for(int num:nums){
                if(num==i){
                    isFound=true;
                    break;
                }
            }
            if(!isFound)
                result.add(i);
        }
        return result;
    }

    public static List<Integer> findAllDisappredNumbers(int[] nums){
        List<Integer> results=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) {
                results.add(i + 1);
            }
        }
        return results;
    }
}

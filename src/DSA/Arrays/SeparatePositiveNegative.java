package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatePositiveNegative {

    public static void main(String[] args) {
        int[] arr = {1, -3, 5, -2, -8, 6, 7};
        //separatePositiveNegativeNumberBruteForce(arr);
        separatePositiveNegativeNumberOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void separatePositiveNegativeNumberBruteForce(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int num : nums) {
            if (num < 0) {
                negative.add(num);
            } else {
                positive.add(num);
            }

        }
        int index=0;
        for (int num:negative){
            nums[index++]=num;
        }

        for(int num:positive){
            nums[index++]=num;
        }

    }

    public static void separatePositiveNegativeNumberOptimal(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }

        }

    }


}

package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresofASortedArray {
    public static void main(String[] args) {
        int[] nums={-4, -1, 0, 3, 10};
        int[] ints = squaresNumbersAndSorted(nums);
        for(int num:ints){
            System.out.print( " "+num);
        }

    }


    public static int[] squaresOfSorted(int [] nums){
        int[] results=new int[nums.length];
        for(int i=0;i< nums.length;i++){
            results[i]=nums[i]*nums[i];
        }
        Arrays.sort(results);
        return results;
    }

    public static int[] squaresNumbersAndSorted(int [] nums){
        int n=nums.length;
        int [] results=new int[n];
        int left=0;
        int right=n-1;
        int pos=n-1;
        while (left<=right){
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            if(leftSquare>rightSquare){
                results[pos--]=leftSquare;
                left++;
            }else{
                results[pos--]=rightSquare;
                right--;
            }
        }
        return results;
    }
}

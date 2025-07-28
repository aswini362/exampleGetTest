package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroes {

    public static void main(String[] args) {
        int [] nums={0, 1, 0, 3, 12};
        //List<Integer> list = movesZerosAtEnd(nums);
        //list.stream().forEach(System.out::println);
        movesZero(nums);
        for(int num:nums){
            System.out.print(" "+num);
        }
    }



    public static List<Integer> movesZerosAtEnd(int[] nums){
        List<Integer> list=new ArrayList<>();
        List<Integer> nonZeros=new ArrayList<>();
        List<Integer> zeros=new ArrayList<>();
        for(int num:nums){
            if(num!=0){
                nonZeros.add(num);
            }else{
                zeros.add(num);
            }

        }
        for(int num:nonZeros){
            list.add(num);
        }for (int num:zeros){
            list.add(num);
        }
        return list;
    }

    //two pointer approach

    public static void movesZero(int [] nums){
        int insertionPosition=0;

        for(int num:nums){
            if(num!=0){
                nums[insertionPosition++]=num;
            }

        }
        while (insertionPosition<nums.length){
            nums[insertionPosition++]=0;
        }
    }

}

package DSA.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MoveAllZeroestoEnd {

    public static void main(String [] args){
        int [] arr={1, 2, 0, 4, 3, 0, 5, 0};
        //System.out.println(movesAllZeros(Arrays.toString(arr)));
        List<Integer> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(x -> x == 0)).values()
                .stream().flatMap(x -> x.stream()).collect(Collectors.toList());
       System.out.println(collect);
    }

    public static void movesAllZeros(int [] nums){
        int insertionPostions=0;
        for(int num:nums){
            if(num!=0){
                nums[insertionPostions++]=num;
            }
        }
        while (insertionPostions>nums.length){
            nums[insertionPostions++]=0;
        }

    }

}

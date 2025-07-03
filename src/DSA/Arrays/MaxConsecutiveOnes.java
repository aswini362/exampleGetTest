package DSA.Arrays;

public class MaxConsecutiveOnes {

    public static void main(String[] args){

    }
    public static int maxCountOne(int[] nums){
        int count=0,maxCount=0;
        for(int num:nums){
            if(num==1){
                count++;
                maxCount=Math.max(maxCount,count);
            }else{
                count= 0;
            }
        }
        return maxCount;
    }
}

package Arrays;

public class MissingNumber {

    public static void main(String[] args){

    }

    public static int findMissingNumber(int [] nums){
        int n = nums.length;
        int acutalSum=0;
        int expectedSum = n * (n + 1) / 2;
        for(int num:nums){
            acutalSum+=num;
        }
        return expectedSum-acutalSum;
    }
}

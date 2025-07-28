package DSA.Arrays;

public class MissingNumbers {

    public static void main(String[] args) {
        int [] nums={3,0,1};
        System.out.println(findMissingNumber(nums));
    }


    public static int findMissingNumber(int nums[]){

        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int acutalSum=0;
        for(int num:nums){
            acutalSum+=num;
        }
        return expectedSum-acutalSum;
    }
}

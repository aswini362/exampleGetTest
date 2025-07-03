package DSA.Arrays;

public class MissingNumbersOFAnArrays {

    public static void main(String [] args){
        int [] num={1, 2 ,3, 5};
     System.out.println(findMissingNumbers(num));
    }

    public static  int findMissingNumbers(int[] nums){
        long n = nums.length+1;
        long expectedSum = n * (n + 1) / 2;
        long actualSum=0;
        for(long num:nums){
            actualSum=actualSum+num;
        }
        return (int) (expectedSum-actualSum);
    }
}

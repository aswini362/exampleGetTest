package Math;

public class SumOfArrays {
    public static void main(String[]args){
        int [] nums={1,2,3,4,5};
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int length = nums.length;
        System.out.println(sum);
        int average = sum / length;
        System.out.println(average);
    }
}

package Arrays;

public class Move0EndOfArrays {
    public static void main(String [] args){
        int[] nums={0,1,0,3,12};
        moveZero(nums);
      for(int num:nums){
          System.out.print(" "+num);
      }
    }

    public static  void moveZero(int[] nums){
        int insertPostion=0;
        for(int num:nums){
            if(num!=0) {
                nums[insertPostion++] = num;
            }
        }
        while(insertPostion<nums.length){
            nums[insertPostion++]=0;
        }
    }
}

package DSA.Arrays;

public class Sort0S1s2s {

    public static void main(String [] args){
       int[] nums= {2,0,2,1,1,0};
       sort(nums);
       for(int num:nums){
           System.out.print(" "+num);
       }
    }

    public static  void sort(int [] nums){

        int low=0;
        int high=nums.length-1;
        int mid=0;

        while (mid<=high){
            if(nums[mid]==0){
                swap(nums,low++,mid++);
            } else if (nums[mid]==1) {
                mid++;
            }else {
                swap(nums,mid,high--);
            }
        }



    }

    public static void swap(int [] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

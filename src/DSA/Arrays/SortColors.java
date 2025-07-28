package DSA.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int [] nums={1,0,1,0,2,0,1,2,0};
        sortColor(nums);
        for(int num:nums){
            System.out.print(" "+num);
        }
    }


    public static void sortColor(int [] nums){
        int mid=0,low=0,high=nums.length-1;
        while (mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            } else if (nums[mid]==1) {
                mid++;
            }else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }

        }

    }
}

package Arrays;

public class RemoveElement {

    public static void main(String [] args){

    }

    public static int removeElement(int[] nums,int k){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=k){
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}

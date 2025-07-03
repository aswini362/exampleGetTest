package DSA.Arrays;

public class Test1 {

    public static void main(String[] args){
        int [] nums={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(nums,target));

    }

    public static int searchInsert(int[] nums, int target) {
        int results = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                results= i;
            }
        }
        return results;
    }

}

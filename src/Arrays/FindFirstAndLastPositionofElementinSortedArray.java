package Arrays;

public class FindFirstAndLastPositionofElementinSortedArray {

         public static void main(String[] args){
             int[] nums = {5, 7, 7, 8, 8, 10};
             int target = 8;
             int[] result = findFirstLastIndex(nums, target);
             System.out.println("[" + result[0] + ", " + result[1] + "]");
         }
    public static int[] findFirstLastIndex(int[] nums, int target) {
        int firstIndex = findIndex(nums, target, true);
        int lastIndex = findIndex(nums, target, false);
        return new int[]{firstIndex, lastIndex};
    }

    private static int findIndex(int[] nums, int target, boolean findIndex) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                index = mid;
                if (findIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return index;
    }
}

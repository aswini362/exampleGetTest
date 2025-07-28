package DSA.Arrays;

import java.util.*;

public class ThridMaximun {

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1};
        int[] arr2 = {1, 2};
        int[] arr3 = {2, 2, 3, 1};
        System.out.println(thirdMax(arr1)); // Output: 1
        System.out.println(thirdMax(arr2)); // Output: 2
        System.out.println(thirdMax(arr3)); // Output: 1
    }



    public static int findThirdMax(int [] nums){

        /*//Time Complexity Breakdown:
        //
        //    Removing duplicates using a HashSet:
        //    → O(N) where N is the size of the input array.
        //
        //    Converting set to list:
        //    → O(K) where K is the number of unique elements.
        //
        //    Sorting the list:
        //    → O(K log K) ≈ O(N log N) in the worst case (if all elements are unique).
        //
        //    Final access by index (like list.get(2)):
        //    → O(1)*/

        Set<Integer> uniqueElement=new HashSet<>();
        for(int num:nums){
            uniqueElement.add(num);
        }
        List<Integer> list=new ArrayList<>(uniqueElement);
        Collections.sort(list,Collections.reverseOrder());
        if (list.size()<3){
            return list.get(0);
        }
        return list.get(2);
    }

    public static int thirdMax(int[] nums) {
        /*⏰ Time Complexity: O(N)

        One pass through the array of size N.

        All operations inside the loop (if, assignments) are O(1).

                So total is O(N).*/

        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;

        for (int num : nums) {
            long n = num;

            if (n == first || n == second || n == third) continue;

            if (n > first) {
                third = second;
                second = first;
                first = n;
            } else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }

        return third == Long.MIN_VALUE ? (int) first : (int) third;
    }

}

package DSA.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode2149RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int[] nums = {1, 2, -4, 3, -5, -9};
        /*alternatePositiveNegativeBrtueForced(nums);*/
        int[] arrangeElementBrute = reArrangeElementBrute(nums);
        int[] arrangeElementBruteOptimal = reArrangeElementOptimal(nums);
        System.out.println(Arrays.toString(arrangeElementBrute));
        System.out.println(Arrays.toString(arrangeElementBruteOptimal));

        int[] nums1={3, 1, -2, -5, 2, 4};
        int[] ints = reArrangeElementVarient2(nums1);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] reArrangeElementBrute(int[] nums) {
        int n = nums.length;
        int p = 0, q = 0;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        for (int num : nums) {
            if (num > 0) {
                pos[p++] = num;
            } else {
                neg[q++] = num;
            }
        }
        int i = 0, j = 0, k = 0;
        int[] resultedArray = new int[n];
        while (i < pos.length && j < neg.length) {
            resultedArray[k++] = pos[i++];
            resultedArray[k++] = neg[j++];
        }
        return resultedArray;
    }

    public static int[] reArrangeElementOptimal(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIndex = 0, negativeIndex = 1;
        for (int num : nums) {
            if (num > 0) {
                ans[posIndex] = num;
                posIndex += 2;
            } else {
                ans[negativeIndex] = num;
                negativeIndex += 2;
            }
        }

        return ans;
    }

    public static int[] reArrangeElementVarient2(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        List<Integer> posIndex = new ArrayList<>();
        List<Integer> negIndex = new ArrayList<>();
        for (int num : nums) {
            if (num > 0) {
                posIndex.add(num);
            } else {
                negIndex.add(num);
            }
        }
        int p = 0, q = 0, i = 0;
        while (p < posIndex.size() && q < negIndex.size()) {
            ans[i++] = posIndex.get(p++);
            ans[i++] = negIndex.get(q++);
        }
        while (p<posIndex.size()){
            ans[i++]=posIndex.get(p++);
        }
        while (q<negIndex.size()){
            ans[i++]=negIndex.get(q++);
        }


        return ans;
    }


}

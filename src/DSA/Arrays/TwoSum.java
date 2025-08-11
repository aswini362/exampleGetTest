package DSA.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 10, 4, 13, 9};
        int target = 15;
        int[] ints1 = twoSumTwoBrute(nums, target);
        String bruteForced = Arrays.toString(ints1);
        int[] twoPointerSum = twoPointerApproached(nums, target);
        System.out.println(Arrays.toString(twoPointerSum));
        int[] hashMapSum = hashMapSum(nums, target);
        System.out.println(Arrays.toString(hashMapSum));
        System.out.println(bruteForced);
    }


    public static int[] twoSumTwoBrute(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) continue;
                if (arr[i] + arr[j] == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] hashMapSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int find = target - arr[i];
            if (map.containsKey(find)) {
                //return new int[]{map.get(find),i};
                return new int[]{find, arr[i]};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    public static int[] twoPointerApproached(int arr[], int target) {
        Arrays.sort(arr);
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}


package DSA.Arrays;

import java.util.*;

public class FoursSumProblems {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        //List<List<Integer>> lists = fourSumProblemBrute(nums, 0);
        List<List<Integer>> lists = hashMapFourSum(nums, 0);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> fourSumProblemBrute(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                            Collections.sort(quad);
                            set.add(quad);
                        }
                    }

                }
            }

        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> hashMapFourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) return result;
        Set<List<Integer>> set = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                Set<Long> seen = new HashSet<>();             // use Long to avoid overflow issues
                for (int k = j + 1; k < n; k++) {             // make sure condition is k < n
                    long complement = (long) target - nums[i] - nums[j] - nums[k];
                    if (seen.contains(complement)) {
                        List<Integer> quad = Arrays.asList(nums[i], nums[j], nums[k], (int) complement);
                        Collections.sort(quad);
                        set.add(quad);
                    }
                    seen.add((long) nums[k]);
                }
            }
        }

        result.addAll(set);
        return result;
    }

    public static List<List<Integer>> fourSumProblemWithTwoPointer(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        results.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    }
                }

            }

        }
        return results;
    }
}

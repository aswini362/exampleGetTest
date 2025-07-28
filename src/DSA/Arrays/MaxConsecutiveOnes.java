package DSA.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(countMaxOne(arr));
    }


    public static int countMaxOne(int[] arr) {
        int count = 0, maxCount = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                maxCount = Math.max(count, maxCount);
            } else {
                count = 0;
            }
        }

        return maxCount;
    }
}

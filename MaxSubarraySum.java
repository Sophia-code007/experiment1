public class MaxSubarraySum {
    public static int maxSubarraySum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, -2, 3, 5, -1};
        int[] nums2 = {1, -2, 3, -8, 5, 1};
        int[] nums3 = {1, -2, 3, -2, 5, 1};

        System.out.println("数组 {1, -2, 3, 5, -1} 的最大子数组和为: " + maxSubarraySum(nums1));
        System.out.println("数组 {1, -2, 3, -8, 5, 1} 的最大子数组和为: " + maxSubarraySum(nums2));
        System.out.println("数组 {1, -2, 3, -2, 5, 1} 的最大子数组和为: " + maxSubarraySum(nums3));
    }
}
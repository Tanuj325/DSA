public class MaximumSubarraySum {
    // Kadane's Algorithm
    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > max) {
                max = sum;
            }

            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("Maximum Subarray sum using kadane algorithm is : " + maxSubArray(nums));
    }

}

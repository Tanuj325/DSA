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

        // if someone to print the subarray

        // int startIndex = -1;
        // int endIndex = -1;
        // int start = 0;
        // for (int i = 0; i < n; i++) {

        //     if(sum == 0){
        //         start =i;
        //     }

        //     sum += nums[i];

        //     if (sum > max) {
        //         max = sum;
        //         startIndex = start;
        //         endIndex = i;
        //     }

        //     if (sum < 0) {
        //         sum = 0;
        //     }

        // }
        // System.out.print("Subarray is : ");
        // for(int i = startIndex;i<=endIndex;i++){
        //     System.out.print(nums[i]+" ");
        // }


        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println("\nMaximum Subarray sum using kadane algorithm is : " + maxSubArray(nums));
    }

}

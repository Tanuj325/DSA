import java.util.Arrays;
public class SmallestDivisorGivenThreshold {
    static int smallestDivisor(int[] nums, int threshold) {
        if(nums.length == 0) return 0;
        
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int ans = high;

        while (low <= high) {
            int mid = (low + high) / 2;
            int sum = 0;
            for (int num : nums) {
                sum += Math.ceil((double) num / (double) mid);
            }
            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 7;
        int result = smallestDivisor(nums, threshold);
        System.out.println("The smallest divisor given the threshold is: " + result);
    }
}
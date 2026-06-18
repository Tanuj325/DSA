public class MajorityElement {
    static int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int element = nums[0];

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = nums[i];
                count++;
            } else if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == element) {
                count++;
            }
        }
        if (count > n / 2) {
            return element;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println("Majority element that appears more than n/2 time is : "+majorityElement(nums));
    }
}

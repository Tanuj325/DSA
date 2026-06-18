import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    static int[] rearrangeArray(int[] nums) {
        int positiveIndex = 0;
        int negativeIndex = 1;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                result[positiveIndex] = nums[i];
                positiveIndex += 2;
            } else {
                result[negativeIndex] = nums[i];
                negativeIndex += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println("Original Array : " + Arrays.toString(nums));

        int[] result = rearrangeArray(nums);

        System.out.println("Rearranged Array : " + Arrays.toString(result));
    }
}

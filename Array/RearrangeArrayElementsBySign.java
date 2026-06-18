import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArrayElementsBySign {

    static int[] rearrangeArrayVariety1(int[] nums) {
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

    static int[] rearrangeArrayVariety2(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                negative.add(nums[i]);
            } else {
                positive.add(nums[i]);
            }
        }

        if (positive.size() > negative.size()) {
            for (int i = 0; i < negative.size(); i++) {
                nums[2 * i] = positive.get(i);
                nums[2 * i + 1] = negative.get(i);
            }

            int index = negative.size() * 2;
            for (int i = negative.size(); i < positive.size(); i++) {
                nums[index++] = positive.get(i);
            }
        } else {
            for (int i = 0; i < positive.size(); i++) {
                nums[2 * i] = positive.get(i);
                nums[2 * i + 1] = negative.get(i);
            }

            int index = positive.size() * 2;
            for (int i = positive.size(); i < negative.size(); i++) {
                nums[index++] = negative.get(i);
            }
        }

        return nums;
    }

    public static void main(String[] args) {

        // Variety 1
        System.out.println("------------------------------Variety 1------------------------------");
        int[] nums1 = { 3, 1, -2, -5, 2, -4 };

        System.out.println("Original Array : " + Arrays.toString(nums1));

        int[] result1 = rearrangeArrayVariety1(nums1);

        System.out.println("Rearranged Array : " + Arrays.toString(result1));

        // Variety 2
        System.out.println("------------------------------Variety 2------------------------------");
        int[] nums2 = { -1, 2, 3, 4, -3, 1 };

        System.out.println("Original Array : " + Arrays.toString(nums2));

        int[] result2 = rearrangeArrayVariety2(nums2);

        System.out.println("Rearranged Array : " + Arrays.toString(result2));
    }
}

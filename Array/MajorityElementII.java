import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int count1 = 0, count2 = 0;
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (count1 == 0 && nums[i] != element2) {
                element1 = nums[i];
                count1++;
            } else if (count2 == 0 && nums[i] != element1) {
                element2 = nums[i];
                count2++;
            } else if (nums[i] == element1) {
                count1++;
            } else if (nums[i] == element2) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (element1 == nums[i]) {
                count1++;
            }
            if (element2 == nums[i]) {
                count2++;
            }
        }
        int min = (int)(n/3) + 1;
        List<Integer> result = new ArrayList<>();
        if (count1 >= min)
            result.add(element1);
        if (count2 >= min && element1 != element2)
            result.add(element2);

        return result;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 2, 2};
        List<Integer> result = majorityElement(nums);
        System.out.println("Majority elements that appear more than n/3 times are: " + result);
    }
}

public class RemoveDuplicatesInSortedArray {
    static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        for (int j = 0; j<i+1;j++) {
            System.out.print(nums[j] + " ");
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 4, 5 };
        System.out.println("\nElements remaining after removing duplicate elements : " + removeDuplicates(arr));
    }
}

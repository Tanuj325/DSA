public class MoveZerosAtEndOfArray {
    static void moveZeroes(int[] nums) {
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 9, 0, 0, 0, 4, 5, 3, 0, 0, 2, 2 };
        moveZeroes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

public class NumberThatAppearsOnceAndOtherTwice {
    static int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4 };
        System.out.println("Number that appears once is : " + singleNumber(arr));
    }
}

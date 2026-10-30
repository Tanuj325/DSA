public class MinimumInRotatedSortedArray {
    static int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = ( low + high) / 2;
            if(nums[low] <= nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid + 1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int result = findMin(arr);
        System.out.println("Minimum element in the rotated sorted array: " + result);
    }
}

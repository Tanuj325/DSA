public class FindKRotation {
    static int findKRotation(int nums[]) {
		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int ans = Integer.MAX_VALUE;
		int index = -1;
		
		while (low <= high) {
			int mid = (low + high) / 2;
			
			if (nums[low] <= nums[high]) {
				if (nums[low] < ans) {
					index = low;
					ans = nums[low];
				}
				break;
			}
			
			if (nums[low] <= nums[mid]) {
				if (nums[low] < ans) {
					index = low;
					ans = nums[low];
				}
				low = mid + 1;
			} else {
				if (nums[mid] < ans) {
					index = mid;
					ans = nums[mid];
				}
				high = mid - 1;
			}
		}
		return index;
		
	}
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        int result = findKRotation(arr);
        System.out.println("The array is rotated " + result + " times.");
    }
}

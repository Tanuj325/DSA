class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= target){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = searchInsert(nums, target);
        System.out.println("Insert position of target " + target + ": " + result);

        target = 2;
        result = searchInsert(nums, target);
        System.out.println("Insert position of target " + target + ": " + result);

        target = 7;
        result = searchInsert(nums, target);
        System.out.println("Insert position of target " + target + ": " + result);

        target = 0;
        result = searchInsert(nums, target);
        System.out.println("Insert position of target " + target + ": " + result);
    }
}

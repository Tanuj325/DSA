class BinarySearch {
    //without recursion
    static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else if(nums[mid] < target){
                low = mid + 1;
            }
        }
        return -1;
    }

    //with recusrion
    static int searchRecursion(int[] nums, int target, int low, int high) {
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return searchRecursion(nums, target, low, mid - 1);
        }else{
            return searchRecursion(nums, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int result = search(nums, target);
        System.out.println("Index of target " + target + ": " + result);

        int resultRecursion = searchRecursion(nums, target, 0, nums.length - 1);
        System.out.println("Index of target " + target + " (recursion): " + resultRecursion);
    }
}
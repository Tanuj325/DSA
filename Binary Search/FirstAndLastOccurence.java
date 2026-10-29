public class FirstAndLastOccurence {
    //Using Lower Bound and Upper Bound

    // static int lowerBound(int[] arr, int target) {
    //     int n = arr.length;
    //     int low = 0;
    //     int high = n-1;
    //     int ans = n;
        
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(arr[mid] >= target){
    //             ans = mid ;
    //             high = mid - 1;
    //         }else{
    //             low = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    // static int upperBound(int[] arr, int target) {
    //     int n = arr.length;
    //     int low = 0;
    //     int high = n-1;
    //     int ans = n;
        
    //     while(low <= high){
    //         int mid = (low + high)/2;
    //         if(arr[mid] > target){
    //             ans = mid ;
    //             high = mid - 1;
    //         }else{
    //             low = mid + 1;
    //         }
    //     }
    //     return ans;
    // }

    // static int[] searchRange(int[] nums, int target) {
    //     int lb = lowerBound(nums,target);
    //     if(lb == nums.length || nums[lb] != target){
    //         return new int[]{-1,-1};
    //     }
    //     return new int[]{lb, upperBound(nums,target) - 1};
    // }

    //Using Binary Search

    static int[] searchRange(int[] nums, int target) {
        int low = 0;
        int n = nums.length;
        int high = n-1;
        int first = -1;
        int last = -1;

        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]== target){
                first = mid;
                high = mid - 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        low = 0;
        high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid]== target){
                last = mid;
                low = mid + 1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return new int[]{first,last};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6};
        int target = 4;
        int[] result = searchRange(arr, target);
        System.out.println("First and last occurrence of target " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
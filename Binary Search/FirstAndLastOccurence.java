public class FirstAndLastOccurence {
    static int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = mid ;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                ans = mid ;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] searchRange(int[] nums, int target) {
        int lb = lowerBound(nums,target);
        if(lb == nums.length || nums[lb] != target){
            return new int[]{-1,-1};
        }
        return new int[]{lb, upperBound(nums,target) - 1};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6};
        int target = 4;
        int[] result = searchRange(arr, target);
        System.out.println("First and last occurrence of target " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
public class CountOccurenceOfElement {
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
    static int countFreq(int[] arr, int target) {
        int[] search = searchRange(arr,target);
        
        if(search[0] == -1) return 0;
        
        return (search[1] - search[0] + 1);
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,4,4,5,6};
        int target = 4;
        int result = countFreq(arr, target);
        System.out.println("Count of target " + target + ": " + result);
    }
}

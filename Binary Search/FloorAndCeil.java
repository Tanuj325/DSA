public class FloorAndCeil {
    static int floor(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] <= target){
                ans = arr[mid] ;
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return ans;
    }
    
    static int ceil(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                ans = arr[mid] ;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,6};
        int target = 3;
        int floorResult = floor(arr, target);
        int ceilResult = ceil(arr, target);
        System.out.println("Floor of target " + target + ": " + floorResult);
        System.out.println("Ceil of target " + target + ": " + ceilResult);
    }
}

public class LongestSubarrayWithGivenSum {

    static int longestSubarray(int[] arr, int k){
        int left =0;
        int right = 0;
        long sum =arr[0];
        int maxLength = 0;
        int n = arr.length;

        while(right < n){
            while(left <= right && sum >k){
                sum -= arr[left++];
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right - left +1);
            }
            right++;
            if(right < n){
                sum+=arr[right];
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        int k = 8;

        int maximumLengthOfSubarrar = longestSubarray(arr, k);
        System.out.println("Maximum length of subarray with sum " + k + " is : " + maximumLengthOfSubarrar);
    }
}

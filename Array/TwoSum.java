import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }

    //For this approach the array should be sorted 
    // static int[] twoSum(int[] arr, int targetSum) {
        // int left = 0;
        // int right = arr.length - 1;
        // int[] result = { 0,0 };

    //     while (left < right) {
    //         if (arr[left] + arr[right] == targetSum) {
    //             result[0] = left;
    //             result[1] = right;
    //             break;
    //         } else if (arr[left] + arr[right] < targetSum) {
    //             left++;
    //         } else if (arr[left] + arr[right] > targetSum) {
    //             right--;
    //         }
    //     }
    //     return result;
    // }



    //Using Hashmap
    static int[] twoSum(int[] arr, int targetSum){
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i = 0;
        int n = arr.length;
        int[] result = { 0,0 };
        for(i =0;i<n;i++){
            if(hash.containsKey(targetSum-arr[i])){
                result[0] = Math.min(i,hash.get(targetSum-arr[i]));
                result[1] = Math.max(i,hash.get(targetSum-arr[i]));
                break;
            }
            hash.put(arr[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int targetSum = 14;

        // mergeSort(arr,0,arr.length-1);
        // int[] result = twoSum(arr, targetSum);
        // System.out.println("Number at index " + result[0] + " and " + result[1] + " makes sum : " + targetSum);
        // System.out.println("Number  " + arr[result[0]] + " and " + arr[result[1]] + " makes sum : " + targetSum);


        int[] result = twoSum(arr, targetSum);
        System.out.println("Number at index " + result[0] + " and " + result[1] + " makes sum : " + targetSum);

    }
}

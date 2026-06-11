//Two pointer approach

// public class ReverseAnArray {
//     static int[] reverseArray(int arr[], int left, int right) {
//         if (left >= right) {
//             return arr;
//         }
//         int temp = arr[left];
//         arr[left] = arr[right];
//         arr[right] = temp;
//         return reverseArray(arr, left + 1, right - 1);

//     }

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 3, 7, 4, 2 };
//         int left = 0;
//         int right = arr.length - 1;
//         System.out.println("Original Array:");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         int[] res = reverseArray(arr, left, right);
//         System.out.println("\nReversed Array:");
//         for (int i = 0; i < res.length; i++) {
//             System.out.print(res[i] + " ");
//         }
//     }

// }


//single pointer approach

public class ReverseAnArray {
    static int[] reverseArray(int arr[], int i, int n) {
        if (i >= n/2) {
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        return reverseArray(arr, i + 1, n);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 4, 2 };
        int i = 0;
        System.out.println("Original Array:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        int[] res = reverseArray(arr, i, arr.length);
        System.out.println("\nReversed Array:");
        for (int j = 0; j < res.length; j++) {
            System.out.print(res[j] + " ");
        }
    }

}

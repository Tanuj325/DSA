public class RecursiveBubbleSort {
    static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1) {
            return;
        }
        boolean didSwap = false;
        for (int j = 0; j < n - 1; j++) {
            if (arr[j] >= arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didSwap = true;
            }

        }
        if (!didSwap) {
            return;
        }
        recursiveBubbleSort(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int n = arr.length;
        System.out.println("Unsorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        recursiveBubbleSort(arr, n);
        System.out.println("\nSorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

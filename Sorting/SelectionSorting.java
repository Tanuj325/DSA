public class SelectionSorting {
    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        int n = arr.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i; j <= n - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println("Sorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

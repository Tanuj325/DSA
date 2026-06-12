public class InsertionSorting {

    static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Unsorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        insertionSort(arr);
        System.out.println("\nSorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

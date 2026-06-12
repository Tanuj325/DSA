public class SelectionSorting {

    static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i <= n - 2; i++) {
            int minIndex = i;
            for (int j = i; j <= n - 1; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Unsorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        selectionSort(arr);
        System.out.println("\nSorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

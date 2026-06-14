public class RecursiveInsertionSort {

    static void recursiveInsertionSort(int[] arr, int i, int n){
        if(i==n) return;
        int j =i;
        while(j>0 && arr[j]<arr[j-1]){
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }

        recursiveInsertionSort(arr, i+1, n);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        int i=0;
        int n = arr.length;
        System.out.println("Unsorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        recursiveInsertionSort(arr, i, n);
        System.out.println("\nSorted array is :");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

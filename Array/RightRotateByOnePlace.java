public class RightRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int temp = arr[n - 1];
        int i;
        for (i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = temp;

        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

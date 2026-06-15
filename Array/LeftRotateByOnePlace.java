public class LeftRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int temp = arr[0];
        int i;
        for (i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[i-1] = temp;

        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

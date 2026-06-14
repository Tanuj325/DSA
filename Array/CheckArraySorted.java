public class CheckArraySorted {
    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = { 10, 50, 4, 0, 2, 4, 5, 8, 6, 1 };
        int[] b = { 10, 20, 30, 50, 80 };

        if (isSorted(a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (isSorted(b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

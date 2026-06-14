public class Smallest {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 4, 8, 7, 2, 1, 4, 5, 2 };
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("smallest Element is : " + smallest);
    }
}

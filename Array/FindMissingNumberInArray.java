public class FindMissingNumberInArray {
    static int missingNum(int arr[]) {
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < arr.length; i++) {
            xor1 = xor1 ^ (i + 1);
            xor2 = xor2 ^ arr[i];
        }
        xor1 = xor1 ^ (arr.length + 1);
        return xor1 ^ xor2;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6, 7 };
        System.out.println("Missing Number in given array is : " + missingNum(arr));
    }
}

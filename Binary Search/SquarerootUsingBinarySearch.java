public class SquarerootUsingBinarySearch {
    static int mySqrt(int x) {
        long left = 0, right = x, ans = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("The square root of " + x + " is: " + result);
    }
}
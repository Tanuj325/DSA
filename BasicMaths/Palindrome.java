public class Palindrome {
    public static void main(String[] args) {
        int n = 1331;
        int ncopy = n;
        int rev = 0;
        while (ncopy > 0) {
            int lastDigit = ncopy % 10;
            rev = rev * 10 + lastDigit;
            ncopy /= 10;
        }
        System.out.println(n==rev);
    }
}

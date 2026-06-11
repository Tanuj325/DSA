import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 1634;
        int ncopy = n;
        int sum = 0;
        int noOfDigits = (int) (Math.ceil(Math.log10(ncopy)));
        while (ncopy > 0) {
            int lastDigit = ncopy % 10;
            sum += (int) Math.pow(lastDigit, noOfDigits);
            ncopy /= 10;
        }
        System.out.println(n == sum);
    }
}

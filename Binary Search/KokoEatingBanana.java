import java.util.Arrays;

public class KokoEatingBanana {
    static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Arrays.stream(piles).max().getAsInt();
        int ans = Integer.MAX_VALUE;

        while (low <= high) {
            int bananaPerHour = (low + high) / 2;
            int totalHours = 0;
            for (int pile : piles) {
                totalHours += Math.ceil((double) pile / (double) bananaPerHour);
            }
            if (totalHours <= h) {
                ans = bananaPerHour;
                high = bananaPerHour - 1;
            } else {
                low = bananaPerHour + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        int result = minEatingSpeed(piles, h);
        System.out.println("The minimum eating speed is: " + result);
    }
}

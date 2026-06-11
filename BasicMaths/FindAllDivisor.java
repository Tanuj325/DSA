import java.util.ArrayList;
import java.util.Collections;

public class FindAllDivisor {
    public static void main(String[] args) {
        int n = 36;
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i < (int) (Math.sqrt(n)); i++) {
            if (n % i == 0) {
                result.add(i);
                if (n / i != i) {
                    result.add(n / i);
                }
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}

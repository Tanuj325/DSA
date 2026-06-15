import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5, 6 };

        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;

        List<Integer> union = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (!union.contains(arr1[i])) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (!union.contains(arr2[j])) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (!union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (!union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
            j++;
        }

        for(int element : union){
            System.out.print(element + " ");
        }
    }
}

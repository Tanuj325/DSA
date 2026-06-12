import java.util.HashMap;

public class HighestOccuringElementInArray {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        int[] arr = { 1, 2, 3, 4, 3, 2, 34, 43, 23, 34, 32, 22, 1, 2, 4, 7, 8, 8, 7, 8, 9, 6, 76, 78, 66, 88 };
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        HashMap<Integer, Integer> max = new HashMap<>();
        int maxKey = 0;
        int maxValue = 0;
        System.out.println(hash);
        for (int key : hash.keySet()) {
            if (hash.get(key) > maxValue) {
                maxValue = hash.get(key);
                maxKey = key;
                max.clear();
            } else if (hash.get(key) == maxValue) {
                maxKey = key;
                maxValue = hash.get(key);
            }
            max.put(maxKey, max.getOrDefault(maxKey, maxValue));

        }
        for(int key : max.keySet()){
            System.out.println("Highest Occurence Element is " + key + " with " + max.get(key) + " times.");
        }
    }
}

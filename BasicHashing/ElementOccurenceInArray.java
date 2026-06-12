import java.util.HashMap;

public class ElementOccurenceInArray {

    // for Numbers

    // public static void main(String[] args) {
    // int n=5;
    // int[] arr = {1,2,3,2,1};

    // //precompute
    // int[] hash = new int[13];
    // for (int i = 0; i < n; i++) {
    // hash[arr[i]] += 1;
    // }

    // //fetching
    // System.out.println(hash[2]);
    // System.out.println(hash[1]);
    // System.out.println(hash[4]);
    // System.out.println(hash[3]);
    // System.out.println(hash[10]);
    // System.out.println(hash[12]);
    // System.out.println(hash[11]);
    // }

    // for character

    // public static void main(String[] args) {
    // char[] arr = { 'a', 't', 'z', 'e', 'f', 'g', 'f', 'd', 'w', 'e', 'y', 'i',
    // 'd', 's', 'e', 'd', 'r', 'f', 't',
    // 'u', 'f', 'g', 'a', 'a', 'a', 'A', 'R', 'E', 'T', 'F', 'E', 'W', 'T', 'T' };

    // // precompute
    // int[] hash = new int[256]; //ARRAY OF TOTAL ASCII CHARACTERS
    // for (int i = 0; i < arr.length; i++) {
    // hash[arr[i]] += 1;
    // }

    // // fetching
    // for (char ch = 'a'; ch <= 'z'; ch++) {
    // System.out.println("Element " + ch + " is occured " + hash[ch] + " times.");
    // }
    // System.out.println();
    // for (char ch = 'A'; ch <= 'Z'; ch++) {
    // System.out.println("Element " + ch + " is occured " + hash[ch] + " times.");
    // }
    // }



    // USING HASHMAP IN JAVA

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hash.put(arr[i], hash.getOrDefault(arr[i], 0) + 1);
        }
        for (int key : hash.keySet()) {
            System.out.println(key + " is occured " + hash.get(key) + " times");
        }
    }
}

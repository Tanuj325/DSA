public class ElementOccurenceInArray {

    public static void main(String[] args) {
        int n=5;
        int[] arr = {1,2,3,2,1};
    
        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        //fetching
        System.out.println(hash[2]);
        System.out.println(hash[1]);
        System.out.println(hash[4]);
        System.out.println(hash[3]);
        System.out.println(hash[10]);
        System.out.println(hash[12]);
        System.out.println(hash[11]);
    }
}

public class Sort0s1s2s {

    // Better Approach
    // static void sort012(int[] arr) {
    // int count0 = 0, count1 = 0, count2 = 0;

    // for(int i=0;i<arr.length;i++){
    // if(arr[i] == 0)
    // count0++;
    // else if(arr[i] == 1)
    // count1++;
    // else if(arr[i] == 2)
    // count2++;
    // }
    // int i;

    // for(i=0;i<count0;i++){
    // arr[i] = 0;
    // }
    // for(i=count0;i<count0+count1;i++){
    // arr[i] = 1;
    // }
    // for(i=count0+count1;i<count0+count1+count2;i++){
    // arr[i] = 2;
    // }
    // }

    //Optimal Approach
    static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
        sort012(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

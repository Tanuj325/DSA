public class LeftRotateByDPlace {
    static void reverse(int[] arr,int low, int high){
        while(low<high){
            int temp= arr[low];
            arr[low] = arr[high];
            arr[high]= temp;
            low++;
            high--;
        }

    }
     public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d =4;
        d=d%n;

        //Brute Force Approach
        // int[] temp= new int[d];
        // for(int i = 0;i<d;i++){
        //     temp[i] = arr[i]; 
        // }
        // for(int i=d ; i<n;i++){
        //     arr[i-d] = arr[i];
        // }
        // for(int i = n-d ; i<n;i++){
        //     arr[i]=temp[i-(n-d)];
        // }


        //Optimal Approach
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr, 0, n-1);


        for(int i:arr){
            System.out.print(i + " ");
        }


    }
}

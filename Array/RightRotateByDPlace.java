public class RightRotateByDPlace {

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
        // for(int i = n-d;i<n;i++){
        //     temp[i-(n-d)] = arr[i]; 
        // }
        // for(int i=n-d-1 ; i>=0;i--){
        //     arr[i+d] = arr[i];
        // }
        // for(int i = 0 ; i<d;i++){
        //     arr[i]=temp[i];
        // }


        //Optimal Approach
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-d-1);
        reverse(arr, 0, n-1);


        for(int i:arr){
            System.out.print(i + " ");
        }


    }
}

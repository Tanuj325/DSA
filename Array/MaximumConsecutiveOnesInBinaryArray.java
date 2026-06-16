public class MaximumConsecutiveOnesInBinaryArray {
    static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxOnes = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 1){
                count++;
            }
            else if(arr[i] == 0){
                count =0;
            }

            if(count>maxOnes){
                maxOnes = count;
            }
        }
        return maxOnes;
    }
     public static void main(String[] args) {
        int[] arr = { 0,1,1,0,1,1,1,1,0,1,1,0,1,1,1 };
        System.out.println("Maximum Number of consecutive 1's in given array is : " + findMaxConsecutiveOnes(arr));
    }
}

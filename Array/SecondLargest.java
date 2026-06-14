public class SecondLargest {
    static int getSecondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i<arr.length; i++) {
			if(arr[i]>largest){
			    secondLargest = largest;
			    largest = arr[i];
			}
			else if (arr[i] < largest && arr[i] > secondLargest){
			    secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        System.out.println("Second Largest Element is : " + getSecondLargest(arr));
    }
}

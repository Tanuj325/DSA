import java.util.ArrayList;

public class LeadersInArray {
    static ArrayList<Integer> leaders(int arr[]) {
		ArrayList<Integer> leaders = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] >= max) {
				leaders.add(arr[i]);
			}
			max = Math.max(max, arr[i]);
		}
		return leaders;
	}
    public static void main(String[] args) {
    int[] arr = {10,22,12,3,0,6};
    ArrayList<Integer> leadersInArray = leaders(arr);
    System.out.println(leadersInArray); 
    }
}

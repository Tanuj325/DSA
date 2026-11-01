public class NthRootUsingbinarySearch {
    static int nthRoot(int n, int m) {
		long low = 1;
		long high = m;
		
		if(m == 0) return 0;
		
		while (low <= high) {
			long mid = (low + high)/2;
			if (Math.pow(mid, n) == m)
				return (int)mid;
			else if (Math.pow(mid, n) < m) {
				low = mid + 1;
			} else {
				high = mid - 1; }
			}
			return - 1;
			
		}
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        int result = nthRoot(n, m);
        System.out.println("The " + n + "th root of " + m + " is: " + result);
    }   
}

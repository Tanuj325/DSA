public class Pattern11 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            // for number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // for space
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            //for number
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}


/*
1      1
12    21
123  321
12344321
*/
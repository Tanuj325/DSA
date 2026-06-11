public class Pattern12 {
    public static void main(String[] args) {
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            if(i%2==1)
                k=1;
            else
                k=0;
            for(int j=1;j<=i;j++){
                System.out.print(k);
                k=1-k;
            }
            System.out.println();
        }
    }
}


/*
1
01
101
0101
10101
*/
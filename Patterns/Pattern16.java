public class Pattern16 {
    public static void main(String[] args) {
        // int n=5;
        // for(char ch='A'; ch <='A'+(n-1);ch++){
        // for(char c = 'A';c<=ch;c++){
        // System.out.print(ch + " ");
        // }
        // System.out.println();
        // }

        // or

        int n = 5;
        for (int i = 1; i <= n; i++) {
            char ch = (char)('A' + (i - 1));
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}

/*
A 
B B 
C C C 
D D D D 
E E E E E
*/
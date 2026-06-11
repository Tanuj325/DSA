public class Pattern17 {
    public static void main(String[] args) {
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        // char ch = 'A';
        // // space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // // character
        // for (int j = 1; j <= 2 * i - 1; j++) {
        // if (j < i) {
        // System.out.print(ch);
        // ch++;
        // } else if (j == i) {
        // System.out.print(ch);
        // } else if (j > i) {
        // ch--;
        // System.out.print(ch);
        // }
        // }
        // // space
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // or

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // character
            char ch = 'A';
            int breakPoint = (2 * i - 1) / 2;  // upto symmetry
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                if (j <= breakPoint) {
                    ch++; //till symmetry
                } else {
                    ch--; //after symmetry
                }
            }
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
    A    
   ABA   
  ABCBA  
 ABCDCBA 
ABCDEDCBA
 */
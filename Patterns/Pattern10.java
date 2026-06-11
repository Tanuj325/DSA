// public class Pattern10 {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= 2 * n - 1; i++) {
//             if (i <= n) {
//                 for (int j = 1; j <= i; j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             } else {
//                 for (int j = 1; j <= 2 * n - i; j++) {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }
//     }

// }

//or

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

/*
*
**
***
****
*****
****
***
**
*
*/
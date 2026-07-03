//Question: Given a row and column, find the value at that position in Pascal's triangle

// public class PascalTriangle {
//     static long nCr(int n, int r) {
//         long res = 1;
//         for(int i =0; i<r; i++){
//             res = res * (n-i);
//             res = res / (i+1);
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int R = 5, C = 3;

//         System.out.println("Value at Row " + R + " and Column " + C + " is: " + nCr(R-1, C-1));

//     }
// }

//Question: Print Nth row of Pascal's triangle

// public class PascalTriangle {
//     static void printNthRow(int N) {
//         long ans = 1;
//         System.out.print(ans + " ");
//         for (int c = 1; c < N; c++) {
//             ans = ans * (N - c) / c;
//             System.out.print(ans + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int N = 5;

//         System.out.println("The " + N + "th row of Pascal's triangle is: ");
//         printNthRow(N);

//     }
// }


//Question: Given a number of rows, print the Pascal's triangle

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static List<Integer> generateRow(int row){
        List<Integer> ans = new ArrayList<>();
        int val = 1;
        ans.add(val);
        for(int col = 1; col < row; col++){
            val = val * (row - col);
            val = val / col;
            ans.add(val);
        }
        return ans;
    }

    static List<List<Integer>> generatePascalTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <= numRows; row++){
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static void main(String[] args) {
        int numRows = 5;

        List<List<Integer>> pascalTriangle = generatePascalTriangle(numRows);

        System.out.println("The first " + numRows + " rows of Pascal's triangle are: ");
        for (List<Integer> row : pascalTriangle) {
            System.out.println(row);
        }
    }
}
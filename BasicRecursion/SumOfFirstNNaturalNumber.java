//Parameterixed way

// public class SumOfFirstNNaturalNumber {
//     static void sumOfFirstNNaturalNumber(int n, int sum) {
//         if (n < 1) {
//             System.out.println(sum);
//             return;
//         }
//         sum += n;
//         sumOfFirstNNaturalNumber(n - 1, sum);
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         int sum = 0;
//         sumOfFirstNNaturalNumber(n, sum);
//     }
// }

//Functional Way

public class SumOfFirstNNaturalNumber {
    static int sumOfFirstNNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfFirstNNaturalNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfFirstNNaturalNumber(n));
    }
}

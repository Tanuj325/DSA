public class PrintReverseCountingFromN {
    static void printReverseFromN(int n) {
        int i = n;
        if (i == 0) {
            return;
        }
        System.out.println(i--);
        printReverseFromN(i);
    }

    public static void main(String[] args) {
        int n = 20;
        printReverseFromN(n);
    }
}

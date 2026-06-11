public class PrintNaturalNumberUptoN {

    static void printUptoN(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println(i++);
        printUptoN(i, n);
    }

    public static void main(String[] args) {
        int n = 20;
        printUptoN(1, n);
    }
}

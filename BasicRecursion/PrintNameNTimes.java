public class PrintNameNTimes {

    static void printName(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Tanuj");
        i++;
        printName(i, n);
    }

    public static void main(String[] args) {
        int n = 5;
        printName(1, n);
    }
}

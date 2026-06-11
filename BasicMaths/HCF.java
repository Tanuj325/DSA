public class HCF {
    public static void main(String[] args) {
        int firstNumber = 52;
        int secondNumber = 10;

        while (firstNumber > 0 && secondNumber > 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }
        if (firstNumber == 0) {
            System.out.println("HCF is : " + secondNumber);
        } else {
            System.out.println("HCF is : " + firstNumber);
        }
    }
}

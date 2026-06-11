public class PrimeNumber {
    public static void main(String[] args) {
        int num = 113;
        int numberOfFactors=0;

        for(int i=1; i*i<=num;i++){
            if(num%i == 0){
                numberOfFactors++;
                if(num/i != i){
                    numberOfFactors++;
                }
            }
        }
        if(numberOfFactors == 2){
            System.out.println(num + " is a Prime Number");
        }else{
            System.out.println(num + " is not a Prime Number");
        }
    }
}

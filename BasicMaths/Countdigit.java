import java.lang.Math;
public class Countdigit {
    public static void main(String[] args) {
        int n = 1001,count=0;
        // while(n>0){
        //     count++;
        //     n/=10;
        // }
        // System.out.println(count);

        //or

        count=(int)(Math.ceil(Math.log10(n)));
        System.out.println(count);



    }
}

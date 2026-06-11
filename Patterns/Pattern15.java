public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i = 1;i<=n;i++){
            for(char ch='A' ; ch<='A'+(n-i);ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}


/*
A B C D E 
A B C D 
A B C 
A B 
A
*/
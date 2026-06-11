public class StringPalindrome {
    static boolean palindromString(String s,int i, int n){
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
        return palindromString(s, i+1, n);
    }

    public static void main(String[] args) {
        String s = "MADAM";
        int i=0;
        int n = s.length();
        System.out.println(palindromString(s, i, n));
    }
}

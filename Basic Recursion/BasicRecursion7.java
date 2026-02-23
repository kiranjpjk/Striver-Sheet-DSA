public class BasicRecursion7 {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(palindrome(0,s));

    }
    static boolean palindrome(int  i , String s){
        if( i >= s.length() / 2) return true;

        if(s.charAt(i) == s.charAt(s.length()-1 - i)) return true;
        return palindrome(i + 1,s);
    }
}

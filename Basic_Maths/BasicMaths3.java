public class BasicMaths3 {
    public static void main(String[] args) {
        int n = 121;
        int revnum =n;
        int rev = 0;
        while(n > 0){
            int temp = n % 10;
            rev = rev * 10 + temp;
            n /= 10;
        }

        if(revnum == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
//Palindrome Number
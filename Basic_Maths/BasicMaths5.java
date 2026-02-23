public class BasicMaths5 {
    public static void main(String[] args) {
        int n = 153;
        int count = (int)Math.log10(n) + 1;
        int rev = 0;
        int org = n;
        while(n > 0){
            int temp = n % 10;
            rev = rev + (int)Math.pow(temp,count);
            n /= 10;
        }
        if (rev == org) {
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong");
        }
    }
}
//Armstrong Number

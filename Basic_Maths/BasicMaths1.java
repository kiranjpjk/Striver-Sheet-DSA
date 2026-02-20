public class BasicMaths1 {
    public static void main(String[] args) {
        int n = 12345;
        int count = 0;
        while(n>0){
            count += 1;
            n /= 10;
        }
        System.out.println(count);
    }
}
//Count all the Digits of a Number
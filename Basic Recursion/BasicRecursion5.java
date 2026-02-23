public class BasicRecursion5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumof(n));
    }
    static int sumof( int n){

        if(n == 1){
            return n;
        }
        return n + sumof(n-1);
    }
}

public class BasicRecursion1 {
    public static void main(String[] args) {
        int n = 7;
        int ans = fibonacci(n);
        System.out.println(ans);
    }
    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
//Fibonacci Number Using Recursion
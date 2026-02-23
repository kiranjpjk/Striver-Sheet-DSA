public class BasicRecursion4 {
    public static void main(String[] args) {
        int n = 4;
        print(1,n);

    }
    static void print(int current, int n){
        if(n < current){
            return;
        }
        System.out.print(n + " ");
        print(current , n-1);

    }
}

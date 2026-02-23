public class BasicRecursion2 {
    public static void main(String[] args) {
        int n = 4;
        print(1,n);

    }
    static void print(int current, int n){
       if(current > n){
           return;
       }
        System.out.print(current + " ");
        print(current + 1, n);
    }
}

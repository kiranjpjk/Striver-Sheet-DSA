public class BasicRecursion3 {
    public static void main(String[] args) {
        int n = 4;
        String name = "Sai";
        print(name, n,1);
    }
    static void print(String name,int n,int current){
        if(current > n){
            return;
        }
        System.out.print(name + " ");
        print(name,n,current+1);
    }
}

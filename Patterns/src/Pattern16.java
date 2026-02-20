public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';
        for (int i = 0; i < n ; i++) {
            for (char ch = 'A'; ch <= 'A' + i ; ch++) {
                System.out.print(c + " ");
            }
            System.out.println();
            c += 1;
        }
    }
}
//A
//B B
//C C C
//D D D D
//E E E E E

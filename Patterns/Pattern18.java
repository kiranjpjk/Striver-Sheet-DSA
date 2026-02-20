public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'A';

            for(char j = (char) (ch + n - 1 - i); j <= (char)(ch + n - 1); j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//E
//D E
//C D E
//B C D E
//A B C D E

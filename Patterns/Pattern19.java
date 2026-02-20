public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        int s = 0;
        for (int i = 0; i < n; i++) {

            for(int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < s; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            s += 2;
            System.out.println();
        }
        s = 2 * n - 2;
        for (int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < s; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            s -= 2;
            System.out.println();
        }
    }
}
//**********
//****  ****
//***    ***
//**      **
//*        *
//*        *
//**      **
//***    ***
//****  ****
//**********
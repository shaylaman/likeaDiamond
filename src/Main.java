import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = inp.nextInt();
        int tempn = n;

        for (int i = 1; i <= n ; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println( );
        }
        for (int i = n - 1; i >= 1 ; i--) {
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= 2*i - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
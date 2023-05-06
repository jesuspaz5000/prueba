import java.util.*;

public class prueba1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, i, j, k;
        System.out.print("Introduzca un número: ");
        n = teclado.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
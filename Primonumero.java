import java.util.Scanner;

public class Primonumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = teclado.nextInt();
        boolean numeroPrimo = true;

        if (numero <= 1) {
            numeroPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    numeroPrimo = false;
                    break;
                }
            }
        }

        if (numeroPrimo) {
            System.out.println("El numero es Primo");
        } else {
            System.out.println("El numero no es Primo");
        }
    }
}

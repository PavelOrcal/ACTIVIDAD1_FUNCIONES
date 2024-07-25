import java.util.Scanner;

public class MaximoComunDivisor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Ingresa el primer numero");
        numero1 = teclado.nextInt();
        System.out.println("Ingresa el segundo numero");
        numero2 = teclado.nextInt();

        while (numero1 != numero2) {
            if (numero1 > numero2) {
                numero1 = numero1 - numero2;
            } else {
                numero2 = numero2 - numero1;
            }
        }

        System.out.println("El maximo comun divisor es: " + numero1);
    }
}
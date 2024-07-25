import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = teclado.nextInt();
System.out.print("La raiz cuadrada es: "+ Math.sqrt(numero));
    }
}

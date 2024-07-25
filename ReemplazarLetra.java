import java.util.Scanner;

public class ReemplazarLetra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la palabra:");
        String texto = teclado.nextLine();
        
        String textoReemplazado = texto.replace('a', 'o').replace('A', 'O');

        System.out.println("Tu texto es: " + textoReemplazado);
    }
}

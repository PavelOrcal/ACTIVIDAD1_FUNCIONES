import java.util.Scanner;

public class TextoMayusculas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa el texto:");
        String texto = teclado.nextLine();
        
        String TextoMayus = texto.toUpperCase();
        
        System.out.println("Tu texto en mayusculas es: "+ TextoMayus);
    }
}

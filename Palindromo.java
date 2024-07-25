import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una palabra: ");
        String palabra = teclado.nextLine();
        boolean Palindromo = true;
        int longitud = palabra.length();
        for (int i = 0; i < longitud / 2; i++) {
            char inicio = palabra.charAt(i);
            char fin = palabra.charAt(longitud - 1 - i);
            
            if (inicio >= 'A' && inicio <= 'Z') {
                inicio = (char)(inicio + 'a' - 'A');
            }
            if (fin >= 'A' && fin <= 'Z') {
                fin = (char)(fin + 'a' - 'A');
            }
            
            if (inicio != fin) {
                Palindromo = false;
                break;
            }
        }
        
        if (Palindromo) {
            System.out.println("La palabra es un palíndromo.");
        } else {
            System.out.println("La palabra no es un palíndromo.");
        }
    }
}

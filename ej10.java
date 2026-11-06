import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();
        int contador = 0;
        
        String t = texto.toLowerCase();
        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contador);
    }
}
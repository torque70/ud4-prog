import java.util.Scanner;

public class ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una línea de texto: ");
        String texto = sc.nextLine();
        System.out.print("Introduce un carácter de búsqueda: ");
        char caracter = sc.nextLine().charAt(0);
        
        int contador = 0;
        int indice = texto.indexOf(caracter);
        while(indice != -1) {
            contador++;
            indice = texto.indexOf(caracter, indice + 1);
        }
        
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces.");
    }
}
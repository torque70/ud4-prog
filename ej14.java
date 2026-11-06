import java.util.Scanner;

public class ej14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una línea de texto: ");
        String texto = sc.nextLine();
        
        System.out.println("En mayúsculas: " + texto.toUpperCase());
        System.out.println("En minúsculas: " + texto.toLowerCase());
    }
}
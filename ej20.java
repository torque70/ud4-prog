import java.util.Scanner;

public class ej20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cad = sc.nextLine();
        
        int len = cad.length();
        if(len < 5) {
            System.out.println("La cadena tiene menos de 5 caracteres.");
        } else if(len >= 5 && len <= 15) {
            System.out.println("La cadena tiene entre 5 y 15 caracteres.");
        } else {
            System.out.println("La cadena tiene más de 15 caracteres.");
        }
    }
}
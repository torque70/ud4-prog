import java.util.Scanner;

public class ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cad = sc.nextLine();
        
        String inversa = "";
        for(int i = cad.length() - 2; i >= 0; i--) {
            inversa += cad.charAt(i);
        }
        
        String resultado = cad + inversa;
        System.out.println("Resultado efecto espejo: " + resultado);
    }
}
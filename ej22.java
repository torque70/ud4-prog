import java.util.Scanner;

public class ej22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cadena principal: ");
        String principal = sc.nextLine();
        System.out.print("Introduce la cadena a buscar: ");
        String buscada = sc.nextLine();
        
        int contador = 0;
        int index = principal.indexOf(buscada);
        while(index != -1) {
            contador++;
            index = principal.indexOf(buscada, index + buscada.length());
        }
        
        System.out.println("La cadena aparece " + contador + " veces.");
    }
}
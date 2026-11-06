import java.util.Scanner;

public class ej23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cadena principal: ");
        String principal = sc.nextLine();
        System.out.print("Introduce la cadena a transformar: ");
        String sub = sc.nextLine();
        
        int index = principal.indexOf(sub);
        if(index != -1) {
            // Partimos la cadena en tres trozos usando substring
            String antes = principal.substring(0, index);
            String medio = principal.substring(index, index + sub.length()).toUpperCase();
            String despues = principal.substring(index + sub.length());
            
            // Unimos las partes
            String resultado = antes + medio + despues;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("La cadena buscada no se encuentra en el texto.");
        }
    }
}
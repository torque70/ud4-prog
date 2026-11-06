import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        String cad1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cad2 = sc.nextLine();
        
        int resultado = cad1.compareTo(cad2);
        if(resultado < 0) {
            System.out.println("La primera cadena es menor que la segunda.");
        } else if(resultado > 0) {
            System.out.println("La primera cadena es mayor que la segunda.");
        } else {
            System.out.println("Ambas cadenas son iguales.");
        }
    }
}
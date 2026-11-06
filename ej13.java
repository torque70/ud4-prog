import java.util.Scanner;

public class ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        String cad1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cad2 = sc.nextLine();
        
        if(cad1.equalsIgnoreCase(cad2)) {
            System.out.println("Las cadenas son iguales (ignorando mayúsculas y minúsculas).");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}
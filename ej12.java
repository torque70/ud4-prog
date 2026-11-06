import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la primera cadena: ");
        String cad1 = sc.nextLine();
        System.out.print("Introduce la segunda cadena: ");
        String cad2 = sc.nextLine();
        
        if(cad1.equals(cad2)) {
            System.out.println("Las cadenas son iguales.");
        } else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}
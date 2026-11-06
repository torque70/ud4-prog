import java.util.Scanner;
public class ej1 {
    public static void main(String[] args) {
        int num[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int n3 = sc.nextInt();
        num[0] = n1;
        num[1] = n2;
        num[2] = n3;
        System.out.print("El número con índice 1 es: " + num[1] );
    }
}

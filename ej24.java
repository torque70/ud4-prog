import java.util.Scanner;
import java.util.Random;

public class ej24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        
        System.out.print("Introduce el número de filas (alto): ");
        int filas = sc.nextInt();
        System.out.print("Introduce el número de columnas (largo): ");
        int columnas = sc.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        int[][] transpuesta = new int[columnas][filas];
        
        System.out.println("Matriz original:");
        for(int i = 0; i < filas; i++) {
            System.out.println();
            for(int j = 0; j < columnas; j++) {
                matriz[i][j] = ra.nextInt(10, 100);
                transpuesta[j][i] = matriz[i][j];
                System.out.print(matriz[i][j] + "\t");
            }
        }
        
        System.out.println("\n\nMatriz transpuesta:");
        for(int i = 0; i < columnas; i++) {
            System.out.println();
            for(int j = 0; j < filas; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
        }
    }
}
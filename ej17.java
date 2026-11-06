import java.util.Random;

public class ej17 {
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        Random ra = new Random();
        
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = ra.nextInt(10000);
        }
        
        // Creamos una copia para ir buscando y descartando los mayores
        int[] copia = new int[1000];
        for(int i = 0; i < numeros.length; i++) {
            copia[i] = numeros[i];
        }
        
        System.out.println("Los 10 mayores números son:");
        for(int k = 0; k < 10; k++) {
            int mayor = copia[0];
            int indiceMayor = 0;
            for(int i = 0; i < copia.length; i++) {
                if(copia[i] > mayor) {
                    mayor = copia[i];
                    indiceMayor = i;
                }
            }
            System.out.println((k + 1) + "º mayor: " + mayor);
            copia[indiceMayor] = -1; // Marcamos como ya procesado
        }
    }
}
import java.util.Random;

public class ej19 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random ra = new Random();
        
        for(int i = 0; i < array.length; i++) {
            array[i] = ra.nextInt(1, 101);
        }
        
        // Ordenamiento manual mediante bucles anidados (Método Burbuja)
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        
        System.out.println("Array ordenado:");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
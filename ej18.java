import java.util.Random;

public class ej18 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random ra = new Random();
        
        int mayor = 10;
        int menor = 80;
        int suma = 0;
        
        for(int i = 0; i < array.length; i++) {
            array[i] = ra.nextInt(10, 81);
            suma += array[i];
            if(array[i] > mayor) {
                mayor = array[i];
            }
            if(array[i] < menor) {
                menor = array[i];
            }
        }
        
        double media = (double) suma / array.length;
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        System.out.println("Media: " + media);
    }
}
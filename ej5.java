import java.util.Random;

public class ej5 {
    public static void main(String[] args) {
        int num3[] = new int[15];
        Random ra = new Random();
        for(int i = 0; i<15; i++){
            num3[i] = ra.nextInt(1,1000);
        }
        int contador = 0;
        for(int i = 0; i<15; i++){
            if(num3[i]%2!=0){
                contador+= 1;
            }
        }
        System.out.print("Hay " + contador +" números impares.");

    }
}

import java.util.Random;

public class ej7 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Random ra = new Random();
        for(int i = 0; i<3; i++){
            System.out.print("\n");
            for(int j = 0; j<3;j++){
                matriz[i][j]= ra.nextInt(1,100);
                System.out.print(matriz[i][j]+",");
            }
        }
        System.out.println("\n");
        for(int i = 2; i>=0; i--){
            System.out.print("\n");
            for(int j = 2; j>=0;j--){
                System.out.print(matriz[i][j]+",");
            }
        }

    }
}

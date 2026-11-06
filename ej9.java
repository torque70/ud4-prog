import java.util.Scanner;
public class ej9 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int mayor = 0;
        int posicionx =0;
        int posiciony =0;
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3;j++){
                System.out.print("Rellena la posicion de la matriz["+i+"]["+j+"] : ");
                int num = sc.nextInt();
                matriz[i][j] = num;
                if(matriz[i][j]> mayor){
                    mayor = matriz[i][j];
                    posicionx = i;
                    posiciony = j; 
                }
            }
        }
        System.out.printf("El número mayor se encuentra en %d,%d y el número es %d",posicionx,posiciony,mayor);

    }
}

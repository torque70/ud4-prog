import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        int matriz[][] = new int[20][20];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<20;i++){
            for(int j = 0; j<20;j++){
                System.out.print("Rellena la posicion de la matriz["+i+"]["+j+"] ");
                int num = sc.nextInt();
                matriz[i][j] = num;
            }
        }
        //Matriz ya hecha, ahora sumar las columnas
        int suma = 0;
        int columna = 0;
        int suma_columna = 0;
        int mayor = 0;
        int columna_max = 0;
        for(int i = 0; i<20; i++){
            suma = 0;  
            for(int j = 0; j<20; j++){
                int num = matriz[j][i];
                    suma += num;
                if(j==2){
                    suma_columna += suma;
                    columna = i+1;
                    if(suma_columna > mayor){
                        mayor = suma_columna;
                        columna_max = columna;
                    }   
                }
                suma_columna = 0;
                
            }
             
        }
        for(int i = 0; i<20; i ++){
            System.out.print("\n");
            for(int j = 0; j<20; j++){
                System.out.print(matriz[i][j] );
            }
        }
        System.out.printf("\nLa columna más alta es la %d y su suma es %d",columna_max,mayor);
    }
}

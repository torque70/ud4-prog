import java.util.Random;

public class ej4 {
    public static void main(String[] args) {
        int num2[] = new int[15];
        Random ra = new Random();
        for(int i = 1;i<=15;i++){
            num2[i-1] = ra.nextInt(20);
        }
        System.out.print("Array: [");
        for(int i = 0;i<num2.length;i++){
            System.out.print(num2[i]+", ");
        }
        System.out.print("] \n");
        int mayor = 0;
        for(int i = 1;i<num2.length-1;i++){
            if(num2[i]>num2[i-1] && num2[i]>num2[i+1] && num2[i]>=mayor){
                mayor = num2[i];
            }
        }
        System.out.println("El número mas grande es : "+ mayor);

    }
}

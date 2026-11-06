import java.util.Scanner;

public class ej16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una línea de texto: ");
        String texto = sc.nextLine().toLowerCase();
        
        int[] conteo = new int[26];
        for(int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if(c >= 'a' && c <= 'z') {
                int pos = c - 'a';
                conteo[pos]++;
            }
        }
        
        System.out.println("\n--- Formato Tabular ---");
        System.out.println("Letra\tOcurrencias");
        for(int i = 0; i < 26; i++) {
            char letra = (char) ('a' + i);
            System.out.println(letra + "\t" + conteo[i]);
        }
    }
}
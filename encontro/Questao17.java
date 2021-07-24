import java.util.Scanner;

public class Questao17 {
    // Escreva um programa Java que dado dois vetores
    // indique os elementos que estão presentes nos dois vetores.
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];

        for (int i = 0 ; i < a.length; i++) {
            System.out.println("indice: " + i + " ");
            a[i] = in.nextInt();
        }
        for (int i = 0 ; i < b.length; i++) {
            System.out.println("indice: " + i + " ");
            b[i] = in.nextInt();
        }

        for (int i = 0 ; i < a.length ; i++) {
            for (int j = 0 ; j < b.length ; j++) {
                System.out.println(i + " " + j);
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}

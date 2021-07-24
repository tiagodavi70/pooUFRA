import java.util.Scanner;

public class Questao12 {

    // Escreva um programa Java que receba um número indeterminado
    // de valores, e conte os números entre 50 e 150.
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int numero = 0;
        int contador = 0;

        while (numero >= 0) {
            numero = in.nextInt();
            if (numero > 50 && numero < 150) {
                contador = contador + 1;
            }
        }
        System.out.println(contador);

    }
}
import java.util.Scanner;

public class ContarMultiplo {

    // Escreva um programa Java que leia vários números inteiros e positivos e 
    // imprima a quantidade dos números múltiplos de 3.
    public static void main(String[] args) {

        int num = 0 ;
        int contador_multiplos = 0;
        Scanner in = new Scanner(System.in);
        while (num >= 0) {
            System.out.println("Escreva um número inteiro e positivo: ");
            num = in.nextInt();

            if (num % 3 == 0) {
                contador_multiplos = contador_multiplos + 1;
            }
        }
        System.out.println("total de múltiplos: " + contador_multiplos);
        in.close();
    } 
}
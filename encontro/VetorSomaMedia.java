import java.util.Scanner;


public class VetorSomaMedia {
    // Escreva um programa Java que leia um vetor de 5 posições e imprima a soma e média de seus valores.
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double[] vetor = new double[5];
        double soma = 0, media = 0;

        for (int i = 0 ; i< vetor.length ; i++ ) {
            vetor[i] = in.nextDouble();
        }

        for (int i = 0 ; i < vetor.length ; i++) {
            soma += vetor[i];
        }
        media = soma / vetor.length;
        System.out.println(soma + " " + media);
    }
}

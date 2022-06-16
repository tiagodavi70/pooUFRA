import java.util.Scanner;

// Escreva um programa que receba 15 números e apresente 
// o maior e o menor entre eles, e a soma de ambos. 
// Por fim apresente a média de todos os 15.

public class Extra1 {
    
    public static void main(String[] args) {
        
        double numero;
        int max = 15;
        // double menor = 999999999, maior = -999999999;
        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE;
        double somaMaiorMenor;
        double soma = 0, media;
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < max; i++) {
            numero = entrada.nextDouble();

            // if (i == 0) {
            //     maior = menor = numero;
            // }

            // teste do maior e menor
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            soma = soma + numero;
        }
        somaMaiorMenor = maior + menor;
        media = soma / max;
        System.out.println(somaMaiorMenor + " " + media);
    }
}

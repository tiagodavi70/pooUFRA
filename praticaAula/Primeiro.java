import java.util.Scanner;

public class Primeiro {

    public static void main(String[] args) {

        int variavel_a;
        float variavel_b;
        double variavel_c;

        char caracter;
        String nome;
        int tamanho = 10;

        variavel_a = 10;
        variavel_b = 3.0f;
        variavel_c = 2.0;
        caracter = 'a';
        nome = "Tiago";

        System.out.println("Olá mundo");

        Scanner entrada = new Scanner(System.in);

        variavel_a = entrada.nextInt();

        System.out.println("O valor de entrada é:" + variavel_a);

        boolean logico = true; // true - verdadeiro, false - falso

        variavel_b = entrada.nextFloat();
        boolean resultado_logico = true && false;
        if (variavel_b > 5f) {
            System.out.println("Maior que 5");
            System.out.println(resultado_logico);
        } else {
            System.out.println("Menor ou igual a 5");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i+1);
        }
    }
}
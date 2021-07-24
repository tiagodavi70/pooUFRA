import java.util.Scanner;

public class ParImpar {

    // Escreva um programa Java que apresente todos os 
    // números ímpares entre dois números dados pelo usuário, e em seguida a soma entre os pares.
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int comeco = in.nextInt();
        int final_ = in.nextInt();
        int soma = 0;

        for (int i = comeco ; i <= final_ ; i++) {
            if ( i % 2 != 0 ) {
                System.out.println(i);
            } else {
                soma = soma + i;
            }
        }
        System.out.println(soma);
    }
}
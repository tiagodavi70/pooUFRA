import java.util.Scanner;

public class AlistamentoMilitar {

    //Escreva um programa Java que receba o sexo e idade de uma pessoa e
    // imprima se é elegível para o serviço militar obrigatório.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a idade:");
        int idade = in.nextInt();

        System.out.println("Entre com o sexo (m/f): ");
        String sexo = in.next();

        if ( (idade > 18) && (sexo.equals("m")) ) {
            System.out.println("É elegível");
        } else {
            System.out.println("Não é elegível");
        }
        in.close();
    }
}
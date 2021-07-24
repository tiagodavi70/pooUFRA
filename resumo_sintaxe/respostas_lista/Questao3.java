import java.util.Scanner;


public class Questao3 {
    
    // Escreva um programa Java que receba o salário de um funcionário, calcule e imprima o valor do imposto de renda a ser pago,
    // sabendo que o imposto equivale a 5% do salário.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double salario = 0;
        double imposto = 0;

        System.out.print("Entre com o salario: ");
        salario = in.nextDouble();

        imposto = salario * (5/100.0); // 0.05
        
        System.out.println("O valor de imposto do salario " + salario + " e de " + imposto);
    }
}
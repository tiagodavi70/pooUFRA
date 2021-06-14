import java.util.Scanner;

class Ordem {

    // Escreva um programa em Java que receba 3 valores e mostre "crescente" se estiverem em ordem crescent, "decrescente" se estiverem em ordem decrescente 
    // e "sem ordem" caso nenhum dos dois.

    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva o primeiro valor: ");
        num1 = in.nextFloat();

        System.out.println("Escreva o segundo valor: ");
        num2 = in.nextFloat();

        System.out.println("Escreva o terceiro valor: ");
        num3 = in.nextFloat();

        in.close();

        if (num1 > num2  && num2 > num3){
            System.out.println("Decrescente");
        } else {
            if (num1 < num2 && num2 < num3){
                System.out.println("Crescente");
            } else {
                System.out.println("Sem ordem");
            }
        }
    }
}
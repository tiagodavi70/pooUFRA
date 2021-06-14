import java.util.Scanner;

class Media {

    // Escreva um programa em Java que receba 3 valores e mostre a média entre eles.
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

        System.out.println("Media: " + ( (num1 + num2 + num3) / 3));
    }
}
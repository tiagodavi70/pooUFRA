
/*
 * Faça um programa que calcule a área de uma figura geométrica.
 * Deve aceitar quatro tipos de figura geométrica: quadrado, retângulo, 
 * triângulo e círculo. Use herança e polimorfismo.
 */

public class Principal {

    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo(10, 15);
        System.out.println(ret1.area());
        Quadrado quad1 = new Quadrado(10);
        System.out.println(quad1.area());

        System.out.println(quad1);
    }
}
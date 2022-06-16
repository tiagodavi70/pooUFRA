import venda.Venda;
import venda.Ventilador;

public class Exemplo {
    // O que é um objeto?
    // O que é uma classe?

    // Escreva um programa Java que receba dados sobre
    // 10 pessoas: nome, sexo (M ou F) e altura.
    // Ao final apresente:

    // Pessoa
    // -nome, -sexo, -altura

    // Tiago, M, 1.76
    // Alexandre, M, 1.8
    // Bianca, F, 1.68

    // Ventilador
    // -numero_pas, -velocidade, -altura, -cor, -marca, -voltagem

    // 6, 3, 60, preto, britania, 110 - Ventilador1
    // 6, 3, 1.2, preto, britania, 110 - Ventilador2

    public static void main(String[] args) {
        
        // Ventilador ventilador1;
        // ventilador1 = new Ventilador(); 

        Ventilador v1 = new Ventilador(6, 3, 0.6, "preto", "britania", "110");
        Ventilador v2 = new Ventilador(6, 3, 1.2, "preto", "britania", "110");
        Ventilador v3 = new Ventilador(4, 3);

        v3.setMarca("britania");
        System.out.println(v3.getMarca());

    }
}

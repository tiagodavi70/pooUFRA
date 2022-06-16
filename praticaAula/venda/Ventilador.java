package venda;

public class Ventilador {
    
    private int numero_pas;
    private int velocidade; // 1 - 3
    private double altura; // 0.15 ~ 2
    // int centimetros_altura; // 15 - 200
    private String cor; // preto, branco, cinza, 000000
    private String marca;
    private String voltagem; // 110, 220

    public Ventilador() {
        numero_pas = 4;
        // System.out.println("Criou um ventilador com " + numero_pas + " pas");
    }

    public Ventilador(int numero_pas, int velocidade) {
        this.numero_pas = numero_pas;
        this.velocidade = velocidade;
    }

    public Ventilador(int numero_pas, int velocidade, double altura, String cor) {
        this.numero_pas = numero_pas;
        this.velocidade = velocidade;
        this.altura = altura;
        this.cor = cor;
        this.marca = null;
        this.voltagem = "110";
    }

    public Ventilador(int numero_pas, int velocidade, double altura, String cor, String marca, String voltagem) {
        this.numero_pas = numero_pas;
        this.velocidade = velocidade;
        this.altura = altura;
        this.cor = cor;
        this.marca = marca;
        this.voltagem = voltagem;
    }

    // Método
    // Métodos get - recuperar valor
    public String getMarca() {
        return this.marca;
    }

    // Métodos get - trocam valores
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNPas() {
        return this.numero_pas;
    }

    public void setNPas(int numero_pas) {
        this.numero_pas = numero_pas;
    }
}

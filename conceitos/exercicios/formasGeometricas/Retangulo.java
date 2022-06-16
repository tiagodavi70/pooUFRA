public class Retangulo {
    double altura;
    double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double area(){
        return this.altura * this.largura;
    }

    @Override
    public String toString() {
        return "Retangulo de altura: " + this.altura + " e largura: " + this.largura;
    }
}

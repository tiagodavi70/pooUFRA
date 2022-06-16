public class Quadrado extends Retangulo {
    
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado com lados: " + this.altura;
    }
}

public class Onibus extends Veiculo {

    double tarifa;

    public Onibus(String nome, double km, double velocidadeMaxima ){
        super(nome, km, velocidadeMaxima);
    }

    public Onibus(String nome, double km, double velocidadeMaxima, double tarifa){
        super(nome, km, velocidadeMaxima);
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    
    @Override
    public String toString() {
        return this.nome + " " + this.kilometragem + " " 
                + this.velocidadeMaxima + " " + this.tarifa;
    }
}

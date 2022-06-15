public class Equipamento {
   
    String tipo;
    double custo;
    String ano;

    public Equipamento(String tipo, double custo, String ano) {
        this.tipo = tipo;
        this.custo = custo;
        this.ano = ano;
    }

    public String getTipo() {
        return tipo;
    }
    // public void setTipo(String tipo) {
    //     this.tipo = tipo;
    // }
    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    public String getAno() {
        return ano;
    }
    // public void setAno(String ano) {
    //     this.ano = ano;
    // }

    @Override
    public String toString() {
        return "Equipamento: " + this.tipo;
    }
}

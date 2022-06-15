public class Bandeira {

    String cor;
    double taxaConsumo;
    double juros;
    double imposto;
    double iluminacao;
    
    Bandeira(String cor, double taxaConsumo, double juros, double imposto, double iluminacao) {
        this.cor = cor;
        this.taxaConsumo = taxaConsumo;
        this.juros = juros;
        this.imposto = imposto;
        this.iluminacao = iluminacao;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public double getTaxaConsumo() {
        return taxaConsumo;
    }
    public void setTaxaConsumo(double taxaConsumo) {
        this.taxaConsumo = taxaConsumo;
    }
    public double getJuros() {
        return juros;
    }
    public void setJuros(double juros) {
        this.juros = juros;
    }
    public double getImposto() {
        return imposto;
    }
    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    public double getIluminacao() {
        return iluminacao;
    }
    public void setIluminacao(double iluminacao) {
        this.iluminacao = iluminacao;
    }

    @Override
    public String toString() {
        return "Bandeira " + this.cor;
    }
}

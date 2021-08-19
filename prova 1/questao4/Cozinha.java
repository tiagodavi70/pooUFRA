package questao4;

public class Cozinha {
    
    String refrigeracao;
    int pias;
    int mesas;

    Cozinha(String refrigeracao, int pias, int mesas) {
        this.refrigeracao = refrigeracao;
        this.pias = pias;
        this.mesas = mesas;
    }

    public String getRefrigeracao() {
        return this.refrigeracao;
    }

    public void setRefrigeracao(String refrigeracao) {
        this.refrigeracao = refrigeracao;
    }

    public int getPias() {
        return this.pias;
    }

    public void setPias(int pias) {
        this.pias = pias;
    }

    public int getMesas() {
        return this.mesas;
    }

    public void setMesas(int mesas) {
        this.mesas = mesas;
    }

    @Override
    public String toString() {
        return "Refrigeracao: " + this.refrigeracao + "\n" +
                "Pias: " + this.pias + "\n" +
                "Mesas: " + this.mesas;
    }
}

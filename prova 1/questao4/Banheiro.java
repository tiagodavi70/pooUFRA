package questao4;

public class Banheiro {
    
    String chuveiro;
    double tamanho;
    String encanamento;

    Banheiro(String chuveiro, double tamanho, String encanamento) {
        this.chuveiro = chuveiro;
        this.tamanho = tamanho;
        this.encanamento = encanamento;
    }

    public String getChuveiro() {
        return this.chuveiro;
    }

    public void setChuveiro(String chuveiro) {
        this.chuveiro = chuveiro;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getEncanamento() {
        return this.encanamento;
    }

    public void setEncanamento(String encanamento) {
        this.encanamento = encanamento;
    }

    @Override
    public String toString() {
        return "Chuveiro: " + this.chuveiro + "\n" +
                "Tamanho: " + this.tamanho + "\n" +
                "Encanamento: " + this.encanamento;
    }
}
